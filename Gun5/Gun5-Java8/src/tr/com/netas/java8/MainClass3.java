package tr.com.netas.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		
		for(int i=0;i<100;i++)
		{
			sayilar.add(i);
		}
		
		
		
		
		
		
		long start = System.currentTimeMillis();
		sayilar.stream().map( x-> x * x).forEach(x->System.out.println(x));
		long end =System.currentTimeMillis();
		System.out.println("Stream : "+(end-start));
		
		start = System.currentTimeMillis();
		sayilar.parallelStream().map(x->x*x).forEach(x->System.out.println(x));
		end =System.currentTimeMillis();
		System.out.println("Paralel Stream : "+(end-start));
		
		
		
		int sum = sayilar.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(sum);
	}

}
