package tr.com.netas.threads;

public class YeniThread extends Thread {
	
	private String threadName;
	private OrtakNesne ortakNesne;
	
	
	
	
	public YeniThread(OrtakNesne ortakNesne,String threadName) {
		super();
		this.ortakNesne = ortakNesne;
		this.threadName = threadName;

	}




	@Override
	public void run() 
	{
		this.ortakNesne.ortakMethod(threadName);
	}

}
