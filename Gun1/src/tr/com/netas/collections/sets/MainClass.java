package tr.com.netas.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		HashSet<Integer>  sayilar = new HashSet<>();
		
		for(int x =0;x<10;x++)
		{
			sayilar.add(x *x );
		}
		
		sayilar.add(49);
		sayilar.add(null);
	
		
		for(Integer x : sayilar)
		{
			System.out.println(x);
		}
		*/
		
		
		LinkedHashSet<Integer>  sayilar = new LinkedHashSet<>();
		
		for(int x =0;x<10;x++)
		{
			sayilar.add(x *x );
		}
		
		sayilar.add(49);
		sayilar.add(null);
	
		
		for(Integer x : sayilar)
		{
			System.out.println(x);
		}

	}

}
