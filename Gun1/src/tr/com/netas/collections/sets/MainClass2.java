package tr.com.netas.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MainClass2 {

	public static void main(String[] args) {
		
		
		HashSet<Calisan>  cals = new HashSet<>();
		
		for(int x =0;x<10;x++)
		{
			cals.add(new Calisan(x+1, "ahmet"+(x+1) ));
		}
		

		cals.add(new Calisan(10, "ahmet10"));
	
		
	for(Calisan c: cals)
	{
		System.out.println(c);
	}
		

	}

}
