package tr.com.netas.dp.behavioral.observer;

public class MainClass {

	public static void main(String[] args) {
	
		TrafikIsigi trafikIsigi = new TrafikIsigi();
		
		Araba araba = new Araba();
		araba.bak(trafikIsigi);
		
		
		Kamyon kamyon = new Kamyon();
		kamyon.bak(trafikIsigi);
		
		Otobus otobus = new Otobus();
		otobus.bak(trafikIsigi);
		
		
		Minibus minibus = new Minibus();
		
		trafikIsigi.yesil();
		
		System.out.println();
		System.out.println();
		System.out.println();
		trafikIsigi.kirmizi();

	}

}
