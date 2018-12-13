
package tr.com.netas.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sube complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sube">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="musteriler" type="{http://ws.netas.com.tr/}musteri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subeAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subeKod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sube", propOrder = {
    "id",
    "musteriler",
    "subeAd",
    "subeKod"
})
public class Sube {

    protected int id;
    @XmlElement(nillable = true)
    protected List<Musteri> musteriler;
    protected String subeAd;
    protected String subeKod;

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
     * Gets the value of the musteriler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the musteriler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMusteriler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Musteri }
     * 
     * 
     */
    public List<Musteri> getMusteriler() {
        if (musteriler == null) {
            musteriler = new ArrayList<Musteri>();
        }
        return this.musteriler;
    }

    /**
     * Gets the value of the subeAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubeAd() {
        return subeAd;
    }

    /**
     * Sets the value of the subeAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubeAd(String value) {
        this.subeAd = value;
    }

    /**
     * Gets the value of the subeKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubeKod() {
        return subeKod;
    }

    /**
     * Sets the value of the subeKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubeKod(String value) {
        this.subeKod = value;
    }

}
