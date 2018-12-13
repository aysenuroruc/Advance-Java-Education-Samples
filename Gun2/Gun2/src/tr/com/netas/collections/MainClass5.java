package tr.com.netas.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainClass5 {

	public static void main(String[] args) {
		
		
		
		
		//Synchronized  version of Map implementations
		Hashtable<String, Calisan> ccs = new Hashtable<>();
		
		for(int i=0;i<10;i++)
			ccs.put("a"+(i*i), new Calisan(12, "aa11111"));
		
		
		for(String key : ccs.keySet())
		{
			System.out.println(key+" -->" +ccs.get(key));
		}

	}

}
