package tr.com.netas.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainClass4 {

	public static void main(String[] args) {
		/*
		TreeMap<String, Calisan> ccs = new TreeMap<>();
		
		for(int i=0;i<10;i++)
			ccs.put("a"+(i*i), new Calisan(12, "aa11111"));
		
		
		for(String key : ccs.keySet())
		{
			System.out.println(key+" -->" +ccs.get(key));
		}
*/
		
		
		TreeMap<Calisan, Integer> nss = new TreeMap<>();
		for(int i=0;i<10;i++)
			nss.put( new Calisan((i), "aa11111"),(i*i));
		
		for(Calisan key : nss.keySet())
		{
			System.out.println(key+" -->" +nss.get(key));
		}
	}

}
