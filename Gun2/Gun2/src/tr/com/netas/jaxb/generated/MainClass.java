package tr.com.netas.jaxb.generated;

import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		
		StudentsType students = new StudentsType();
		
		StudentType t1 = new StudentType(1,"aaa","aaa");
		StudentType t2 = new StudentType(2,"bbb","bbb");
		StudentType t3 = new StudentType(3,"ccc","ccc");
		students.getStudent().add(t1);
		students.getStudent().add(t2);
		students.getStudent().add(t3);
		
		JAXBContext ctx = JAXBContext.newInstance("tr.com.netas.jaxb.generated");
		
		 Marshaller mrshl =  ctx.createMarshaller();
		 mrshl.marshal(students, new FileWriter("abc.xml"));
		 
		 System.out.println("bitti");
	

	}

}
