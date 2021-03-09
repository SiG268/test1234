
package orderservice.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getOrder complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrder", propOrder = {
    "orderNo"
})
public class GetOrder {

    protected int orderNo;

    /**
     * Ruft den Wert der orderNo-Eigenschaft ab.
     * 
     */
    public int getOrderNo() {
        return orderNo;
    }

    /**
     * Legt den Wert der orderNo-Eigenschaft fest.
     * 
     */
    public void setOrderNo(int value) {
        this.orderNo = value;
    }

}
