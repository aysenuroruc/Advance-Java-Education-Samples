package tr.com.netas.mbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import tr.com.netas.jpa.domain.Musteri;
import tr.com.netas.services.UserService;

@ManagedBean
public class IndexBean {
	
	private Musteri musteri = new Musteri();
	
	@EJB
	private UserService userService;
	
	
	public void saveUser()
	{
		userService.saveUser(musteri);
		System.out.println("User saved" + musteri);
	}


	public Musteri getMusteri() {
		return musteri;
	}


	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	
	

}
