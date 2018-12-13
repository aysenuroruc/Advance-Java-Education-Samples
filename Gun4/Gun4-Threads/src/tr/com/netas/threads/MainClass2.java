package tr.com.netas.threads;

public class MainClass2 {
	
	
	public static void main(String[] args) {
		
		OrtakNesne o = new OrtakNesne();

		YeniThread yt1 = new YeniThread(o, "T1");
		YeniThread yt2 = new YeniThread(o, "T2");
		YeniThread yt3 = new YeniThread(o, "T3");
		
		yt1.start();
		yt2.start();
		yt3.start();
	}
	

}
