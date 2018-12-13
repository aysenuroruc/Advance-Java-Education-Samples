package tr.com.netas.threads;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		MyThread t1 = new MyThread("First Thread",10);
		MyThread t2 = new MyThread("Second Thread", 20);
		MyThread t3 = new MyThread("Third Thread", 20);
		Thread t4 = new Thread(new MyRunnable("Fourth Thread", 22));
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		

	}

}
