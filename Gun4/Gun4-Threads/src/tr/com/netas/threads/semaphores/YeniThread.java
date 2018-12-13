package tr.com.netas.threads.semaphores;

import java.util.concurrent.Semaphore;

public class YeniThread extends Thread {
	
	private String threadName;
	private MySemaphore semaphore;
	private int count;
	
	
	
	
	public YeniThread(MySemaphore mySemaphore,String threadName,int count) {
		super();
		this.threadName = threadName;
		this.semaphore = mySemaphore;
		this.count = count;
	

	}




	@Override
	public void run() 
	{
		try 
		{
			this.semaphore.acquire();
			this.semaphore.ortakMethod(threadName, count);
			this.semaphore.release();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
