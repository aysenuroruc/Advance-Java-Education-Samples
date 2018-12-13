package tr.com.netas.collections.sets;

public class Calisan implements Comparable<Calisan>{
	
	private int id;
	private String ad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Calisan [id=" + id + ", ad=" + ad + "]";
	}
	public Calisan(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}
	
	@Override
	public boolean equals(Object obj) {
		Calisan c = (Calisan) obj;
		if(this.id == c.getId())
			return true;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public int compareTo(Calisan diger) {
		
		Integer x = this.id;
		return x.compareTo(diger.getId());
	}
	
	

	
}
