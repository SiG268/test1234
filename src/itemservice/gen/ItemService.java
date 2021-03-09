
package itemservice.gen;

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
@WebService(name = "ItemService", targetNamespace = "http://semesterarbeit2.wi.mbg.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ItemService {


    /**
     * 
     * @param itemNo
     * @return
     *     returns itemservice.gen.Item
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getItem", targetNamespace = "http://semesterarbeit2.wi.mbg.de/", className = "itemservice.gen.GetItem")
    @ResponseWrapper(localName = "getItemResponse", targetNamespace = "http://semesterarbeit2.wi.mbg.de/", className = "itemservice.gen.GetItemResponse")
    @Action(input = "http://semesterarbeit2.wi.mbg.de/ItemService/getItemRequest", output = "http://semesterarbeit2.wi.mbg.de/ItemService/getItemResponse")
    public Item getItem(
        @WebParam(name = "itemNo", targetNamespace = "")
        int itemNo);

}
