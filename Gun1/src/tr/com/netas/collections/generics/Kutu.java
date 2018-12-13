package tr.com.netas.collections.generics;

public class Kutu<T> {
	
	private T eleman;
	
	public void kutuyaKoy(T object)
	{
		this.eleman = object;
	}
	
	public T kutudanAl()
	{
		return this.eleman;
	}

}
