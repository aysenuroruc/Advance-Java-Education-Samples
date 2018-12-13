package tr.com.netas.jpa.domain;

import java.io.Serializable;
import java.util.List;


public class Musteri implements Serializable{
	

	private String kimlik;
	private String ad;
	private String soyad;




	public Musteri(String kimlik, String ad, String soyad) {
		super();
		this.kimlik = kimlik;
		this.ad = ad;
		this.soyad = soyad;
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

	
	@Override
	public String toString() {
		return "Musteri [kimlik=" + kimlik + ", ad=" + ad + ", soyad=" + soyad  
				+ "]";
	}
	
	
	

}
