package tr.com.netas.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import tr.com.netas.jpa.domain.Musteri;

@WebService
public class NetasSOAPService {
	
	@WebMethod
	public String test(String name)
	{
		return "Hello " + name;
	}
	
	@WebMethod
	public List<Musteri> musteriler()
	{
		List<Musteri> ms = new ArrayList<>();
		
		ms.add(new Musteri("11111", "aaaa", "aaaa"));
		ms.add(new Musteri("22222", "bbbb", "bbbb"));
		ms.add(new Musteri("33333", "cccc", "cccc"));
		return ms;
	}
	

}
