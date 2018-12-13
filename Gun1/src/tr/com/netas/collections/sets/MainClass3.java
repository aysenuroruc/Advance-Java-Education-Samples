package tr.com.netas.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainClass3 {

	public static void main(String[] args) {
		
		
		TreeSet<String>  ss = new TreeSet<>();
		
		
		ss.add("zeynep");
		ss.add("ali");
		ss.add("Veli");
		ss.add("Ahmet");
		ss.add("Şeyma");
		
		for(String x : ss)
		{
			System.out.println(x);
		}
		

	}

}
