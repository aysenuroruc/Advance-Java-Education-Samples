package tr.com.netas.pruducer.consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	
	private BlockingQueue<Integer> queue;

	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

	try {
		while(true)
		{
			int x =  this.queue.take();
			System.out.println("CONSUMER sayıyı işledi : "+x);
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
