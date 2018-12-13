package tr.com.netas.collections.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<MyString> names = new PriorityQueue<>();
		
	

		
		names.add(new MyString(1,"john"));
		names.add(new MyString(5,"jack"));
		names.add(new MyString(2,"jane"));
		names.add(new MyString(99,"aaa"));
		names.add(new MyString(1101,"bbb"));
		

		
	
		System.out.println(names.poll());
		
		
		
		System.out.println(names.poll());
		
		
		
	
		

	}

}
