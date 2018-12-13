package tr.com.netas.socket.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import tr.com.netas.jpa.domain.Musteri;

public class MainClassClient {

	public static void main(String[] args)  throws Exception
	
	{
		Socket socket = new Socket("localhost", 9999);
		System.out.println("CLIENT : sunucuya bağlanıldı");
		
		ObjectInputStream ois = 
				new ObjectInputStream(socket.getInputStream());
		
		 Musteri m = (Musteri)  ois.readObject();

		
		System.out.println( "CLIENT -> serverdan gelen obje : "+ m);
		
		


	}

}
