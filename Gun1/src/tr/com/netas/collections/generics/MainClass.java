package tr.com.netas.collections.generics;

import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		

		Kutu<String> kutu1 = new Kutu<String>();
		kutu1.kutuyaKoy("ahmet");
		
		
		
		
		Kutu<Integer> kutu2 = new Kutu<Integer>();
		kutu2.kutuyaKoy(123);
		
		
	
		
		System.out.println(kutu2.kutudanAl());
		
		BasicEmployee e = new BasicEmployee(12, 12);
		Kutu<BasicEmployee> kutu3 = new Kutu<BasicEmployee>();
		kutu3.kutuyaKoy(e);
		
		
		
		
		
		MyGenericClass<String, Integer, FileReader, BasicEmployee> aa 
						= new MyGenericClass<>();
		
		
		
		

	}

}
