package tr.com.netas.threads;

public class MyRunnable implements Runnable{


	private String threadName;
	private int count;
	
	
	
	
	public MyRunnable(String threadName, int count) {
		super();
		this.threadName = threadName;
		this.count = count;
	}




	@Override
	public void run() 
	{
		try 
		{
			for(int i=0;i<this.count;i++)
			{
				Thread.sleep(500);
				System.out.println(this.threadName+"  --> "+ i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
