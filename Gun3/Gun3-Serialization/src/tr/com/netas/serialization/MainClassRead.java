package tr.com.netas.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tr.com.netas.jpa.domain.Musteri;

public class MainClassRead {

	public static void main(String[] args) throws Exception
	{
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("musteri.bin"));
		
		 Musteri m = (Musteri)  ois.readObject();

		
		System.out.println(m);

	}

}
