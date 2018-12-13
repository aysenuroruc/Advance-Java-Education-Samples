package tr.com.netas.threads.executorservice;

public class MyThread extends Thread{
	
	private String name;
	
	
	
	public MyThread(String name) {
		super();
		this.name = name;
	}



	@Override
	public void run() {
		try {
		for(int i =0 ;i<10;i++)
		{
			Thread.sleep(1000);
			System.out.println( name +" -- > "+ i);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
