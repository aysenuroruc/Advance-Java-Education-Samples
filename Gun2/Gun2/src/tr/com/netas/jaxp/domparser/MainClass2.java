package tr.com.netas.jaxp.domparser;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MainClass2 {

	public static void main(String[] args) throws Exception
	{
		
		 DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
		 DocumentBuilder domParser = dbf.newDocumentBuilder();
		 
		 
		 Document doc =  domParser.newDocument();
		 Element rootElement = doc.createElement("calisanlar");
		
		 doc.appendChild(rootElement);
		 
		 for(int i=0;i<100;i++)
		 {
			Element emp1 =  doc.createElement("employee");
			Element empName = doc.createElement("name");
			empName.setTextContent("AHMET"+i);
			Element empLastName = doc.createElement("lastname");
			empLastName.setTextContent("DEMIRELLI"+i);
			emp1.appendChild(empName);
			emp1.appendChild(empLastName);
			
			rootElement.appendChild(emp1);
		 }
		
		
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		 
		transformer.transform(new DOMSource(doc),
				new StreamResult( new FileOutputStream("lastemployee.xml")));
		 
		 
System.out.println("Bitti");
	}

}
