package tr.com.netas.gc;

import java.util.ArrayList;
import java.util.List;

import tr.com.netas.jpa.domain.Musteri;

public class MainClass {

	
	public static Musteri mmm;
	public static void main(String[] args) throws Exception
	{
		System.out.println("başladı");
		Thread.sleep(1000*10);
		System.out.println("nesneler yaratılacak");
		for(int i=0;i<100000;i++)
		{
			createMusteri(10000000);
			System.out.println("10 milyon nesne yaratıldı");
			Thread.sleep(1000*2);
			
		}
		System.out.println("Herşey bitti");
		Thread.sleep(1000*50);
		
		

	}
	
	
	public static void createMusteri(int x)
	{
		List<Musteri> ms = new ArrayList<>();
		for(int i=0;i<x;i++)
		{
			Musteri m1 = new Musteri("1111","aaaa","bbbb");
			ms.add(m1);
	
		}
			
			
	}

}
