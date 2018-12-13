package tr.gov.nvi.tckimlik.ws;

public class MainClass {

	public static void main(String[] args) {
	
		
		KPSPublicSoap kimlikService = 
				new KPSPublic().getKPSPublicSoap();
		
	   boolean sonuc =	kimlikService.tcKimlikNoDogrula(169363033432L,
			   "AHMET", "DEMİRELLİ",
				1978);
	   
	   System.out.println(sonuc);

	}

}
