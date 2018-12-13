package tr.com.netas.pruducer.consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainClass {

	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1000);
		
		Producer p1 = new Producer(queue,0);
		p1.start();
		
		Producer p2 = new Producer(queue,2);
		p2.start();
		
		Producer p3 = new Producer(queue,3);
		p3.start();
		
		Producer p4 = new Producer(queue,5);
		p4.start();
		
		
		Consumer consumer = new Consumer(queue);
		
		consumer.start();
		
		

	}

}
