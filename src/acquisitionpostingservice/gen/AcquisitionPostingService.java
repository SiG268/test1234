
package acquisitionpostingservice.gen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AcquisitionPostingService", targetNamespace = "http://semesterarbeit2.wi.mbg.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AcquisitionPostingService {


    /**
     * 
     * @param orderNo
     * @param quantity
     * @param itemNo
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAveragePurchasePrice", targetNamespace = "http://semesterarbeit2.wi.mbg.de/", className = "acquisitionpostingservice.gen.GetAveragePurchasePrice")
    @ResponseWrapper(localName = "getAveragePurchasePriceResponse", targetNamespace = "http://semesterarbeit2.wi.mbg.de/", className = "acquisitionpostingservice.gen.GetAveragePurchasePriceResponse")
    @Action(input = "http://semesterarbeit2.wi.mbg.de/AcquisitionPostingService/getAveragePurchasePriceRequest", output = "http://semesterarbeit2.wi.mbg.de/AcquisitionPostingService/getAveragePurchasePriceResponse")
    public double getAveragePurchasePrice(
        @WebParam(name = "itemNo", targetNamespace = "")
        int itemNo,
        @WebParam(name = "orderNo", targetNamespace = "")
        int orderNo,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity);

}
