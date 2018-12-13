package tr.com.netas.pruducer.consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	private BlockingQueue<Integer> queue;
	private int producerType;
	
	public Producer(BlockingQueue<Integer> queue,int producerType) {
		this.queue = queue;
		this.producerType = producerType;
	}

	@Override
	public void run() {

	try {
		for(int i=0;i<10;i++)
		{
		Thread.sleep(1000);
		int x = new Random().nextInt(100);
			x = producerType*100 + x;
			this.queue.put(x);
			System.out.println("PRODUCER ekleme işlemini gerçekleştirdi");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
