package tr.com.netas.jpa.domain;

import java.util.List;


public class Musteri {
	

	private String kimlik;
	private String ad;
	private String soyad;


	private List<Hesap> hesaplar;
	

	private Sube sube;

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

	public List<Hesap> getHesaplar() {
		return hesaplar;
	}

	public void setHesaplar(List<Hesap> hesaplar) {
		this.hesaplar = hesaplar;
	}

	public Sube getSube() {
		return sube;
	}

	public void setSube(Sube sube) {
		this.sube = sube;
	}

	@Override
	public String toString() {
		return "Musteri [kimlik=" + kimlik + ", ad=" + ad + ", soyad=" + soyad  
				+ "]";
	}
	
	
	

}
