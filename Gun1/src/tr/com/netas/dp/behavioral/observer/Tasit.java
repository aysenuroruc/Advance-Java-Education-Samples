package tr.com.netas.dp.behavioral.observer;

public abstract class Tasit {

	public abstract void git();

	public abstract void  dur();
	
	public void bak(TrafikIsigi trafikIsigi)
	{
		trafikIsigi.listeyeEkle(this);
	}

}
