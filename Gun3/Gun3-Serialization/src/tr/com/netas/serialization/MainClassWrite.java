package tr.com.netas.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tr.com.netas.jpa.domain.Musteri;

public class MainClassWrite {

	public static void main(String[] args) throws Exception
	{
		Musteri m = new Musteri("1111", "aaaa", "bbbb");
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("musteri.bin"));
		
		oos.writeObject(m);
		oos.flush();
		
		System.out.println("bitti");

	}

}
