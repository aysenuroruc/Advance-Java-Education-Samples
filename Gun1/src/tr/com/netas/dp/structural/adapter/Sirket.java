package tr.com.netas.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Sirket {
	
	private List<Calisan> calisanlar = new ArrayList<Calisan>();
	
	
	public void iseAl(Calisan calisan)
	{
		this.calisanlar.add(calisan);
	}


	public void isBaslasin() {
		for(Calisan c : this.calisanlar)
		{
			c.calis();
		}
		
	}

}
