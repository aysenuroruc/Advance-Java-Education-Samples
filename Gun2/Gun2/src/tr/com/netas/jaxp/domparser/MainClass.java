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

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		
		 DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
		 DocumentBuilder domParser = dbf.newDocumentBuilder();
		 
		 
		 Document doc =  domParser.parse("employee.xml");
		 
		 NodeList names =  doc.getElementsByTagName("name");
		 NodeList lnames =  doc.getElementsByTagName("lastname");
		 
		 for(int i=0;i<names.getLength();i++)
		 {
			 System.out.println(names.item(i).getTextContent()
					  + " - " +
					  lnames.item(i).getTextContent());
		 }
		 
		
		 
		 
		 
		Element emp1 =  doc.createElement("employee");
		Node empName = doc.createElement("name");
		empName.setTextContent("AHMET");
		Node empLastName = doc.createElement("lastname");
		empLastName.setTextContent("DEMIRELLI");
		emp1.appendChild(empName);
		emp1.appendChild(empLastName);
		
		doc.getChildNodes().item(0).appendChild(emp1);
		
		
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		 
		transformer.transform(new DOMSource(doc),
				new StreamResult( new FileOutputStream("newemployee.xml")));
		 
		 
System.out.println("Bitti");
	}

}
