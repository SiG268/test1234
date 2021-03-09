package soap;

import javax.jws.WebService;

import acquisitionpostingservice.gen.AcquisitionPostingService;
import acquisitionpostingservice.gen.AcquisitionPostingServiceService;
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
		OrderLine ol = (OrderLine) o.getOrderLines();

		return bestellung;
	}

}
