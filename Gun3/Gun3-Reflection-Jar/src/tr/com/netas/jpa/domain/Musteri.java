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
	
	public void publicMetod()
	{
		System.out.println("Public Method executed");
	}
	
	protected void protectedMetod()
	{
		System.out.println("Protected Method executed");
	}
	
	private void privateMetod()
	{
		System.out.println("Private Method executed");
	}
	
	public void publicMetod(int x)
	{
		System.out.println("Public Method with parameter executed --> param valu="+x);
	}
	
	public int toplama(int x,int y)
	{
		return x+y;
	}
	
	

}
