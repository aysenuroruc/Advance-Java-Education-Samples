package tr.com.netas.dp.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class TrafikIsigi {
	
	
	private List<Tasit> bakanlar  = new ArrayList<Tasit>();
	
	
	public void listeyeEkle(Tasit tasit)
	{
		this.bakanlar.add(tasit);
	}


	public void yesil() {
		
		for(Tasit tasit : this.bakanlar)
		{
			tasit.git();
		}
		
	}


	public void kirmizi() {
		for(Tasit tasit : this.bakanlar)
		{
			tasit.dur();
		}
		
	}
	
	
	

}
