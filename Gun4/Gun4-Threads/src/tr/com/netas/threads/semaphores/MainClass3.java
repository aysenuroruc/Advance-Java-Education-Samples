package tr.com.netas.threads.semaphores;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		MySemaphore s1 = new MySemaphore(2);
		
		YeniThread yt1 = new YeniThread(s1, "T1", 10);
		YeniThread yt2 = new YeniThread(s1, "T2", 15);
		YeniThread yt3 = new YeniThread(s1, "T3", 5);
		YeniThread yt4 = new YeniThread(s1, "T4", 10);
		YeniThread yt5 = new YeniThread(s1, "T5", 5);
		
		yt1.start();
		yt2.start();
		yt3.start();
		yt4.start();
		yt5.start();
		
	}

}
