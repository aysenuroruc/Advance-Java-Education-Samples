package tr.com.netas.jpa.domain;

import java.io.Serializable;
import java.util.List;


public class Musteri implements Serializable{
	

	private int id;
	private String kimlik;
	private String ad;
	private String soyad;




	public Musteri(int id,String kimlik, String ad, String soyad) {
		super();
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyad = soyad;
		this.id=id;
	}

	public Musteri() {
		super();
	}

	public String getKimlik() {
		return kimlik;
	}

	public void setKimlik(String kimlik) {
		this.kimlik = kimlik;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Musteri [ ID= "+id+", kimlik=" + kimlik + ", ad=" + ad + ", soyad=" + soyad  
				+ "]";
	}
	
	
	

}
