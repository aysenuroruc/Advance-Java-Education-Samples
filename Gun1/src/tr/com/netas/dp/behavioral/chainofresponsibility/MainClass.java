package tr.com.netas.dp.behavioral.chainofresponsibility;

public class MainClass {

	public static void main(String[] args) {
	
		TemelAtmaIs temelAtma = new TemelAtmaIs();
		
		DuvarOrmeIs duvarOrme = new DuvarOrmeIs();
		
		
		CatiIs catiIs = new CatiIs();
		
		temelAtma.sonrakiIs(catiIs);
		
		catiIs.sonrakiIs(duvarOrme);
		
		
		temelAtma.isYap();
		
		

	}

}
