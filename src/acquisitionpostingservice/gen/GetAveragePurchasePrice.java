
package acquisitionpostingservice.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getAveragePurchasePrice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getAveragePurchasePrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAveragePurchasePrice", propOrder = {
    "itemNo",
    "orderNo",
    "quantity"
})
public class GetAveragePurchasePrice {

    protected int itemNo;
    protected int orderNo;
    protected int quantity;

    /**
     * Ruft den Wert der itemNo-Eigenschaft ab.
     * 
     */
    public int getItemNo() {
        return itemNo;
    }

    /**
     * Legt den Wert der itemNo-Eigenschaft fest.
     * 
     */
    public void setItemNo(int value) {
        this.itemNo = value;
    }

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

    /**
     * Ruft den Wert der quantity-Eigenschaft ab.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Legt den Wert der quantity-Eigenschaft fest.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

}
