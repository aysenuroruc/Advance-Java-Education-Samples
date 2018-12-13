package tr.com.netas.jaxp.saxparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NetasXMLHandler extends DefaultHandler{
	/*
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Döküman okunmaya başlanıldı");
	}
	
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Döküman okması bitti");
	}
	*/
	
	boolean okumayaBasla = false;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.println("Etiket açıldı -> "+qName);
		if(qName.equals("name"))
			okumayaBasla=true;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("name"))
			okumayaBasla=false;
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String name = new String(ch, start, length);
		if(okumayaBasla && name.startsWith("H"))
			System.out.println(name);
	}

}
