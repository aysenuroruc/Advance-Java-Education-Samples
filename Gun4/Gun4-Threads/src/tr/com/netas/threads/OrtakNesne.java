package tr.com.netas.threads;

public class OrtakNesne {
	
	
	public synchronized void ortakMethod(String threadName)
	{
		try 
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(500);
				System.out.println(threadName+"  --> "+ i);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
