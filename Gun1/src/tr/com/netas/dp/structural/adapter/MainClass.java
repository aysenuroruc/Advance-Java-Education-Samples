package tr.com.netas.dp.structural.adapter;

import com.ispanya.ressam.Ressam;

public class MainClass {

	public static void main(String[] args) {
		
		
		Calisan c1 = new Calisan("Harvey Specter");
		Calisan c2 = new Calisan("Thomas Shelby");
		Calisan c3 = new Calisan("Martin Riggs");
		
		
		Sirket sirket = new Sirket();
		sirket.iseAl(c1);
		sirket.iseAl(c2);
		sirket.iseAl(c3);
		
		
		Ressam ressam = new Ressam("Picasso");
		
		
		sirket.iseAl(new RessamAdaptor(ressam));
		
		
		sirket.isBaslasin();
		
		

	}

}
