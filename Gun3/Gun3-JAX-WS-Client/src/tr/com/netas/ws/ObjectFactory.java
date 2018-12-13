
package tr.com.netas.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tr.com.netas.ws package. 
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

    private final static QName _TestResponse_QNAME = new QName("http://ws.netas.com.tr/", "testResponse");
    private final static QName _MusterilerResponse_QNAME = new QName("http://ws.netas.com.tr/", "musterilerResponse");
    private final static QName _Musteriler_QNAME = new QName("http://ws.netas.com.tr/", "musteriler");
    private final static QName _Test_QNAME = new QName("http://ws.netas.com.tr/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tr.com.netas.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Musteriler }
     * 
     */
    public Musteriler createMusteriler() {
        return new Musteriler();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link MusterilerResponse }
     * 
     */
    public MusterilerResponse createMusterilerResponse() {
        return new MusterilerResponse();
    }

    /**
     * Create an instance of {@link Sube }
     * 
     */
    public Sube createSube() {
        return new Sube();
    }

    /**
     * Create an instance of {@link Musteri }
     * 
     */
    public Musteri createMusteri() {
        return new Musteri();
    }

    /**
     * Create an instance of {@link Hesap }
     * 
     */
    public Hesap createHesap() {
        return new Hesap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.netas.com.tr/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MusterilerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.netas.com.tr/", name = "musterilerResponse")
    public JAXBElement<MusterilerResponse> createMusterilerResponse(MusterilerResponse value) {
        return new JAXBElement<MusterilerResponse>(_MusterilerResponse_QNAME, MusterilerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Musteriler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.netas.com.tr/", name = "musteriler")
    public JAXBElement<Musteriler> createMusteriler(Musteriler value) {
        return new JAXBElement<Musteriler>(_Musteriler_QNAME, Musteriler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.netas.com.tr/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

}
