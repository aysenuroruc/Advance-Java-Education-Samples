package tr.com.netas.dp.structural.adapter;

import com.ispanya.ressam.Ressam;

public class RessamAdaptor extends Calisan{

	public RessamAdaptor(Ressam ressam) {
		super("");
		this.ressam = ressam;
	}
	
	private Ressam ressam;
	
	@Override
	public void calis() {
		
		this.ressam.resimYap();
	}

}
