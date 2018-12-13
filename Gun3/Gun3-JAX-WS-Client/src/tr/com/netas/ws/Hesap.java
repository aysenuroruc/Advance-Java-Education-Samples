
package tr.com.netas.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hesap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hesap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bakiye" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="muster" type="{http://ws.netas.com.tr/}musteri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hesap", propOrder = {
    "bakiye",
    "id",
    "muster"
})
public class Hesap {

    protected double bakiye;
    protected int id;
    protected Musteri muster;

    /**
     * Gets the value of the bakiye property.
     * 
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * Sets the value of the bakiye property.
     * 
     */
    public void setBakiye(double value) {
        this.bakiye = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the muster property.
     * 
     * @return
     *     possible object is
     *     {@link Musteri }
     *     
     */
    public Musteri getMuster() {
        return muster;
    }

    /**
     * Sets the value of the muster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Musteri }
     *     
     */
    public void setMuster(Musteri value) {
        this.muster = value;
    }

}
