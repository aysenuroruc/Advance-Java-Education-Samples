package tr.com.netas.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Hesap {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double bakiye;
	
	public Hesap() {
		super();
	}

	public Hesap(Musteri muster,double bakiye) {
		super();
		this.bakiye = bakiye;
		this.muster = muster;
	}

	@ManyToOne
	private Musteri muster;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public Musteri getMuster() {
		return muster;
	}

	public void setMuster(Musteri muster) {
		this.muster = muster;
	}

	@Override
	public String toString() {
		return "Hesap [id=" + id + ", bakiye=" + bakiye + "]";
	}

}
