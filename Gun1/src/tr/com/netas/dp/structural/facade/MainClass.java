package tr.com.netas.dp.structural.facade;

public class MainClass {

	public static void main(String[] args) {
		
		
		FacadeService facadeService = new FacadeService();
		
		facadeService.sendMail();
		
		facadeService.sendSMS();
		
		facadeService.saveCustomer();

	}

}
