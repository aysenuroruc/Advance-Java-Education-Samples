package tr.com.netas.jaxp.saxparser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		
		SAXParserFactory sf = SAXParserFactory.newInstance();
		SAXParser saxParser = sf.newSAXParser();
		
		DefaultHandler hndl = new NetasXMLHandler();
		saxParser.parse("employee.xml",hndl);
		
		System.out.println("bitti");
		
		

	}

}
