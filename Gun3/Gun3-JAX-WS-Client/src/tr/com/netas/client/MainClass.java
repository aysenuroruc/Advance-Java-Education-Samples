package tr.com.netas.client;

import java.util.List;

import tr.com.netas.ws.Musteri;
import tr.com.netas.ws.NetasSOAPService;
import tr.com.netas.ws.NetasSOAPServiceService;

public class MainClass {

	public static void main(String[] args) {
		
		NetasSOAPService srv = new NetasSOAPServiceService().getNetasSOAPServicePort();
		
		 List<Musteri> ms =  srv.musteriler();
		 for(Musteri m : ms)
		 {
			 System.out.println(m.getAd() + " " +m.getSoyad() +" --> "+m.getKimlik());
		 }

	}

}
