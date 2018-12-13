package tr.com.netas.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tr.com.netas.jpa.domain.Hesap;
import tr.com.netas.jpa.domain.Musteri;
import tr.com.netas.jpa.domain.Sube;

public class MainClass {
	static EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("netasJPA");
	
	static EntityManager entityManager = emf.createEntityManager();


	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
		entityManager.getTransaction().begin();
	
	/*
		Musteri m = new Musteri("123435566", "Leonardo", "DaVinci");
		Sube sube1 = new Sube("Kurtköy", "B02", null);
		Hesap hesap =  sube1.hesapAc(m, 123);
		
		
		m.setSube(sube1);
		//sube1.musteriEkle(m);
		
		entityManager.persist(m);
		entityManager.persist(sube1);
		entityManager.persist(hesap);
		
		
		
		
	   Sube sube =  entityManager.find(Sube.class, 1);
		 
		 System.out.println(sube);
		 
		for(Musteri m : sube.getMusteriler())
		{
			System.out.println(m + "  --> Hesapları :");
			for(Hesap h : m.getHesaplar())
			{
				System.out.println(" ---- "+h);
			}
			
		}
		*/
		
		
		
		 List<Hesap> hesaplar = entityManager.
		createQuery("select h from Hesap h where h.muster.sube.id=1"
				, Hesap.class).getResultList();
		 
		 for(Hesap h : hesaplar)
		 {
			 System.out.println(h);
		 }
		
		 
		 Hesap h2 = entityManager.find(Hesap.class, 2);
		 h2.setBakiye(3500);
		 
		 entityManager.merge(h2);
		 entityManager.remove(h2);
		 
		System.out.println("bitti");
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		emf.close();
	}

}
