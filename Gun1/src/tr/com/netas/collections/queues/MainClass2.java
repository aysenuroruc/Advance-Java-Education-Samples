package tr.com.netas.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass2 {

	public static void main(String[] args) {
		
		ArrayDeque<String> names = new ArrayDeque<>();
		
	

		names.add("aaaa");
		

		names.addLast("zzzz");
		
		
		names.addFirst("oooo");
		
		for(String a : names)
		{
			System.out.println(a);
		}
		
		System.out.println("-------");
		System.out.println(names.poll());
		System.out.println("-------");
		
		
		for(String a : names)
		{
			System.out.println(a);
		}
	
		

	}

}
