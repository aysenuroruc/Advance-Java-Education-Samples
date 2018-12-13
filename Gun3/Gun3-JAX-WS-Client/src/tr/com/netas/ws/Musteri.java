
package tr.com.netas.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for musteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="musteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hesaplar" type="{http://ws.netas.com.tr/}hesap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kimlik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sube" type="{http://ws.netas.com.tr/}sube" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "musteri", propOrder = {
    "ad",
    "hesaplar",
    "kimlik",
    "soyad",
    "sube"
})
public class Musteri {

    protected String ad;
    @XmlElement(nillable = true)
    protected List<Hesap> hesaplar;
    protected String kimlik;
    protected String soyad;
    protected Sube sube;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the hesaplar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hesaplar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHesaplar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hesap }
     * 
     * 
     */
    public List<Hesap> getHesaplar() {
        if (hesaplar == null) {
            hesaplar = new ArrayList<Hesap>();
        }
        return this.hesaplar;
    }

    /**
     * Gets the value of the kimlik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKimlik() {
        return kimlik;
    }

    /**
     * Sets the value of the kimlik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKimlik(String value) {
        this.kimlik = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the sube property.
     * 
     * @return
     *     possible object is
     *     {@link Sube }
     *     
     */
    public Sube getSube() {
        return sube;
    }

    /**
     * Sets the value of the sube property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sube }
     *     
     */
    public void setSube(Sube value) {
        this.sube = value;
    }

}
