
package acquisitionpostingservice.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the acquisitionpostingservice.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAveragePurchasePriceResponse_QNAME = new QName("http://semesterarbeit2.wi.mbg.de/", "getAveragePurchasePriceResponse");
    private final static QName _GetAveragePurchasePrice_QNAME = new QName("http://semesterarbeit2.wi.mbg.de/", "getAveragePurchasePrice");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: acquisitionpostingservice.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAveragePurchasePriceResponse }
     * 
     */
    public GetAveragePurchasePriceResponse createGetAveragePurchasePriceResponse() {
        return new GetAveragePurchasePriceResponse();
    }

    /**
     * Create an instance of {@link GetAveragePurchasePrice }
     * 
     */
    public GetAveragePurchasePrice createGetAveragePurchasePrice() {
        return new GetAveragePurchasePrice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAveragePurchasePriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit2.wi.mbg.de/", name = "getAveragePurchasePriceResponse")
    public JAXBElement<GetAveragePurchasePriceResponse> createGetAveragePurchasePriceResponse(GetAveragePurchasePriceResponse value) {
        return new JAXBElement<GetAveragePurchasePriceResponse>(_GetAveragePurchasePriceResponse_QNAME, GetAveragePurchasePriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAveragePurchasePrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://semesterarbeit2.wi.mbg.de/", name = "getAveragePurchasePrice")
    public JAXBElement<GetAveragePurchasePrice> createGetAveragePurchasePrice(GetAveragePurchasePrice value) {
        return new JAXBElement<GetAveragePurchasePrice>(_GetAveragePurchasePrice_QNAME, GetAveragePurchasePrice.class, null, value);
    }

}
