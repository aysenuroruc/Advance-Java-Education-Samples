package tr.com.netas.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainClass4 {

	public static void main(String[] args) {
		
		
		TreeSet<Calisan>  ss = new TreeSet<>();
		
		ss.add(new Calisan(3, "ali"));
		ss.add(new Calisan(4, "hasan"));
		ss.add(new Calisan(5, "abdullah"));
		ss.add(new Calisan(1, "ahmet"));
		ss.add(new Calisan(6, "ayşe"));
		ss.add(new Calisan(2, "mehmet"));
		
		ss.add(new Calisan(2, "hayrullah"));
		
		
		for(Calisan x : ss)
		{
			System.out.println(x);
		}
		

	}

}
