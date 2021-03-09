package soap;

import java.util.List;

import javax.jws.WebService;

import acquisitionpostingservice.gen.AcquisitionPostingService;
import acquisitionpostingservice.gen.AcquisitionPostingServiceService;
import itemservice.gen.Item;
import itemservice.gen.ItemService;
import itemservice.gen.ItemServiceService;
import orderservice.gen.Order;
import orderservice.gen.OrderLine;
import orderservice.gen.OrderService;
import orderservice.gen.OrderServiceService;

@WebService
public class Service {

	public Bestellinformation profitabilitaetsPruefung(int Bestellnummer) {
		Bestellinformation bestellung = new Bestellinformation();

		AcquisitionPostingServiceService acservicelook = new AcquisitionPostingServiceService();
		AcquisitionPostingService acservice = acservicelook.getAcquisitionPostingServicePort();

		ItemServiceService itemservicelook = new ItemServiceService();
		ItemService itemservice = itemservicelook.getItemServicePort();

		OrderServiceService orderservicelook = new OrderServiceService();
		OrderService orderservice = orderservicelook.getOrderServicePort();

		Order o = orderservice.getOrder(Bestellnummer);

		bestellung.setBestellnummer(o.getOrderNo());
		bestellung.setDatum(o.getOrderDate());
		List<OrderLine> ols = o.getOrderLines();
		for (OrderLine ol : ols) {
			Item i = itemservice.getItem(ol.getItemNo());
			double avgpp = acservice.getAveragePurchasePrice(ol.getItemNo(), Bestellnummer, ol.getQuantity());
			double prof = (ol.getNetSalesUnitPrice() - avgpp) * ol.getQuantity();
			Artikel a = new Artikel(ol.getItemNo(), i.getDescription(), ol.getQuantity(), prof);
			bestellung.artikel.add(a);
		}
		double sum = 0;
		for (Artikel a : bestellung.artikel) {
			sum = sum + a.getProfitabilitaet();
		}
		bestellung.setGuv(sum);
		return bestellung;
	}

}
