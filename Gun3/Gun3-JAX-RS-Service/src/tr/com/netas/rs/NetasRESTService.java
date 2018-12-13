package tr.com.netas.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import tr.com.netas.jpa.domain.Musteri;

@Path("NetasRESTService")
@Stateless
public class NetasRESTService {
	
	@GET
	@Path("toplama/{x}/{y}")
	@Produces(MediaType.APPLICATION_JSON)
	public NetasResponse<Integer> toplama(@PathParam("x") int x,
			@PathParam("y")int y)
	{
		NetasResponse<Integer> sonuc = new NetasResponse<>(true,x+y,"");
		
		return sonuc;
	}
	
	@GET
	@Path("musteriler")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Musteri> musteriler()
	{
		List<Musteri> ms = new ArrayList<>();
		
		ms.add(new Musteri("11111", "aaaa", "aaaa"));
		ms.add(new Musteri("22222", "bbbb", "bbbb"));
		ms.add(new Musteri("33333", "cccc", "cccc"));
		return ms;
	}
	

}
