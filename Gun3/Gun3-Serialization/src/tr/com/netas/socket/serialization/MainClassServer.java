package tr.com.netas.socket.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import tr.com.netas.jpa.domain.Musteri;

public class MainClassServer {

	public static void main(String[] args)  throws Exception
	
	{
		ServerSocket server = new ServerSocket(9999);
		System.out.println("SERVER : server başlatıldı");
		Socket socket =  server.accept();
		System.out.println("SERVER : birisi bağlandı " +socket.getInetAddress());
		
		Musteri m = new Musteri("2222", "yyyyy", "zzzzz");
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(socket.getOutputStream());
		
		oos.writeObject(m);
		oos.flush();
		
		System.out.println("SERVER : obje gönderildi");

	}

}
