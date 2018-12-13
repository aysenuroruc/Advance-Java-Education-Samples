package tr.com.netas.threads.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainClass2 {

	public static void main(String[] args) {
	
		
	   ScheduledExecutorService exeSrv =Executors.newScheduledThreadPool(5);
	   
	   exeSrv.scheduleAtFixedRate(new MyThread("Test"),5, 5, TimeUnit.SECONDS);
	   
	   exeSrv.scheduleAtFixedRate(new MyThread("Tst"), 10,5, TimeUnit.SECONDS);
	   

	}

}
