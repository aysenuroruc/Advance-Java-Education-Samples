package tr.com.netas.dp.behavioral.chainofresponsibility;

public abstract class Is {
	
	
	private Is sonrakiIs;
	
	public void sonrakiIs(Is is)
	{
		this.sonrakiIs = is;
	}
	
	public abstract void is();
	
	public void isYap()
	{
		this.is();
		
		if(this.sonrakiIs !=null)
		{
			this.sonrakiIs.isYap();
		}
		else
		{
			System.out.println("Işler bitti");
		}
	}

}
