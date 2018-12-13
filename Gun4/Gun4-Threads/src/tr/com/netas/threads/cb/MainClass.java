package tr.com.netas.threads.cb;

import java.util.concurrent.CountDownLatch;

public class MainClass {

	public static void main(String[] args) {
	
		OkeyOyunu oyun1 = new OkeyOyunu(4);
		
		Oyuncu oyuncu1 = new Oyuncu("Ahmet");
		oyuncu1.oyunaBaglan(oyun1);
		oyuncu1.start();
		
		try {
			Thread.sleep(1000*2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Oyuncu oyuncu2 = new Oyuncu("Mehmet");
		oyuncu2.oyunaBaglan(oyun1);
		oyuncu2.start();
		
		try {
			Thread.sleep(1000*4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Oyuncu oyuncu3 = new Oyuncu("Ali");
		oyuncu3.oyunaBaglan(oyun1);
		oyuncu3.start();
		try {
			Thread.sleep(1000*20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Oyuncu oyuncu4 = new Oyuncu("Veli");
		oyuncu4.oyunaBaglan(oyun1);
		oyuncu4.start();
		
		
		

	}

}
