package tr.com.netas.rs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

import tr.com.netas.jpa.domain.Musteri;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		
		//Session devam etmesi için
		
		
		URL url = new URL("http://localhost:8080/Gun3-JAX-RS-Service/rest/NetasRESTService/musteriler");
		BufferedReader rd = new BufferedReader(new InputStreamReader(
				url.openStream()));
		String content = "";
		while(true)
		{
			String line = rd.readLine();
			if(line==null)
				break;
			content+=line;
			
		}
		
		//System.out.println(content);
		
		Gson gson = new Gson();
		
	   Musteri[] musteriler =	   gson.fromJson(content, Musteri[].class);
	   
	   for(Musteri m : musteriler)
	   {
		   System.out.println(m.getAd() + " "+m.getSoyad() +" ("+m.getKimlik()+")");
	   }

	}

}
