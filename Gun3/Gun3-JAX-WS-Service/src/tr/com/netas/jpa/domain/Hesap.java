package tr.com.netas.jpa.domain;




public class Hesap {
	
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
