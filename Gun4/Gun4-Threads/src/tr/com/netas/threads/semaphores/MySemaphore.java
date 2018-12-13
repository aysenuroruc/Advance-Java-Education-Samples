package tr.com.netas.threads.semaphores;

import java.util.concurrent.Semaphore;

public class MySemaphore extends Semaphore{

	
	private int sayi;
	
	public MySemaphore(int permits) {
		super(permits);
	}
	
	
	public void ortakMethod(String threadName,int count)
	{
		try 
		{
			for(int i=0;i<count;i++)
			{
				Thread.sleep(500);
				sayi++;
				System.out.println(threadName+"  --> "+ i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
