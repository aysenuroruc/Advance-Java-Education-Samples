package tr.com.netas.threads.cb;

public class Oyuncu  extends Thread{
	
	private OkeyOyunu okeyOyunu;
	private String name;
	
	
	
	
	public Oyuncu(String name) {
		super();
		this.name = name;
	}


	public void oyunaBaglan(OkeyOyunu oyun)
	{
		this.okeyOyunu = oyun;
		
		
	}


	@Override
	public void run() {
		try 
		{
			System.out.println(name+"  bekliyor");
			this.okeyOyunu.await();
			for(int i=0;i<10;i++)
			{
				System.out.println(this.name + "  - oynuyor");
				Thread.sleep(1000);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
