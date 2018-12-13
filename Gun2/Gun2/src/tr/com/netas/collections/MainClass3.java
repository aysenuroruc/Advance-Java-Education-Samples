package tr.com.netas.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MainClass3 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Calisan> ccs = new LinkedHashMap<>();
		
		for(int i=0;i<10;i++)
			ccs.put("a"+(i*i), new Calisan(12, "aa11111"));
		
		
		for(String key : ccs.keySet())
		{
			System.out.println(key+" -->" +ccs.get(key));
		}

	}

}
