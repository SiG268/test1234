
package orderservice.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für orderLine complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="orderLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="netSalesUnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
@XmlType(name = "orderLine", propOrder = {
    "itemNo",
    "netSalesUnitPrice",
    "quantity"
})
public class OrderLine {

    protected int itemNo;
    protected double netSalesUnitPrice;
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
     * Ruft den Wert der netSalesUnitPrice-Eigenschaft ab.
     * 
     */
    public double getNetSalesUnitPrice() {
        return netSalesUnitPrice;
    }

    /**
     * Legt den Wert der netSalesUnitPrice-Eigenschaft fest.
     * 
     */
    public void setNetSalesUnitPrice(double value) {
        this.netSalesUnitPrice = value;
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
