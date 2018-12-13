package tr.com.netas.collections.lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		ArrayList<Integer>  sayilar = new ArrayList<>();
		
		for(int x =0;x<10;x++)
		{
			sayilar.add(x *x );
		}
		
		sayilar.add(49);
		sayilar.add(null);
	
		
		sayilar.add(0, 123);
		for(Integer x : sayilar)
		{
			System.out.println(x);
		}
		 */	
	
		
		LinkedList<Integer>  sayilar = new LinkedList<>();
		
		for(int x =0;x<10;x++)
		{
			sayilar.add(x *x );
		}
		
		sayilar.add(2,49);
	
		sayilar.addFirst(39999);
		
		for(Integer x : sayilar)
		{
			System.out.println(x);
		}
		
		//ArrayList ile aynı özellikleri taşır
		//tek farkı synchronized olmasıdır
		Vector<Integer> nums = new Vector<>();
		
		
		
		Stack<Integer> s1 = new Stack<>();
		
		s1.add(11);
		s1.add(22);
		s1.add(33);
		
		System.out.println(s1.pop());
		
		
	
	
	}

}
