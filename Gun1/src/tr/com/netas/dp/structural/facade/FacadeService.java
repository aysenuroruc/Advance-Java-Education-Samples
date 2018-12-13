package tr.com.netas.dp.structural.facade;

public class FacadeService {
	
	
	private SMSService smsService = new SMSService();
	private MailService mailService = new MailService();
	private CustomerService customerService =  new CustomerService();

	
	public void sendMail() {
		mailService.send();
		
	}
	public void sendSMS() {
		
		smsService.send();
	}
	public void saveCustomer() {
		customerService.save();
		
	}

}
