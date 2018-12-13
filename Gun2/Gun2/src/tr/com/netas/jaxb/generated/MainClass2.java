package tr.com.netas.jaxb.generated;

import java.io.FileReader;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MainClass2 {

	public static void main(String[] args) throws Exception
	{
		
	
		
		JAXBContext ctx = JAXBContext.newInstance("tr.com.netas.jaxb.generated");
		
		 Unmarshaller umrshl =  ctx.createUnmarshaller();
		 
		 StudentsType sts =  (StudentsType)umrshl.unmarshal(new FileReader("abc.xml"));
		 
		 for (StudentType s : sts.getStudent())
		 {
			 System.out.println(s);
		 }
		 System.out.println("bitti");
	

	}

}
