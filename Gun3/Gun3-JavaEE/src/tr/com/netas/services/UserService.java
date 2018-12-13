package tr.com.netas.services;

import javax.ejb.Asynchronous;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tr.com.netas.jpa.domain.Musteri;

@Stateless
public class UserService {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	public void saveUser(Musteri musteri) {
		
		entityManager.persist(musteri);
	}

}
