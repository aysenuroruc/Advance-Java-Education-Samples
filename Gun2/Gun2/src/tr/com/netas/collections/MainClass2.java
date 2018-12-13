package tr.com.netas.collections;

import java.util.HashMap;

public class MainClass2 {

	public static void main(String[] args) {
		
		HashMap<String, Calisan> ccs = new HashMap<>();
		
		for(int i=0;i<10;i++)
			ccs.put("a"+(i*i), new Calisan(12, "aa11111"));
		
		
		for(String key : ccs.keySet())
		{
			System.out.println(key+" -->" +ccs.get(key));
		}

	}

}
