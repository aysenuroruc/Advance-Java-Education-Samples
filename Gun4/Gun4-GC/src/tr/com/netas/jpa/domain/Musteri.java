package tr.com.netas.jpa.domain;

import java.util.List;

import tr.com.netas.gc.MainClass;




public class Musteri {
	
	
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
	
	
	@Override
	protected void finalize() throws Throwable {
		
		//Burada ne oluyor ???
		MainClass.mmm = this;
		
		//MainClass.mmm = new Musteri("sd","dsd","sds");

	}
	
	

}
