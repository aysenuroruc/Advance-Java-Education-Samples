package tr.com.netas.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sube {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String subeAd;
	private String subeKod;
	@OneToMany(mappedBy="sube")
	private List<Musteri> musteriler;
	
	
	public Sube(String subeAd, String subeKod, List<Musteri> musteriler) {
		super();
		this.subeAd = subeAd;
		this.subeKod = subeKod;
		this.musteriler = musteriler;
	}


	public Sube() {
		super();
	}

	
	public void musteriEkle(Musteri musteri)
	{
		if(this.musteriler==null)
			this.musteriler=new ArrayList<>();
		this.musteriler.add(musteri);
	}

	public Hesap hesapAc(Musteri musteri,double miktar)
	{
		Hesap hesap = new Hesap(musteri,miktar);
		hesap.setMuster(musteri);
		return hesap;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSubeAd() {
		return subeAd;
	}


	public void setSubeAd(String subeAd) {
		this.subeAd = subeAd;
	}


	public String getSubeKod() {
		return subeKod;
	}


	public void setSubeKod(String subeKod) {
		this.subeKod = subeKod;
	}


	public List<Musteri> getMusteriler() {
		return musteriler;
	}


	public void setMusteriler(List<Musteri> musteriler) {
		this.musteriler = musteriler;
	}


	@Override
	public String toString() {
		return "Sube [id=" + id + ", subeAd=" + subeAd + ", subeKod=" + subeKod + "]";
	}
	
	

}
