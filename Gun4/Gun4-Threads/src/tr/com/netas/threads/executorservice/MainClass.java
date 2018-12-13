package tr.com.netas.threads.executorservice;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import tr.com.netas.threads.timerservice.MyCallable;

public class MainClass {

	public static void main(String[] args) {
		
		/*
	  ExecutorService executorService = 	Executors.newCachedThreadPool();
	  
	  executorService.execute(new MyThread("Thread 1 "));
	  executorService.execute(new MyThread("Thread 2 "));
	  executorService.execute(new MyThread("Thread 3 "));
	  
	  executorService.shutdownNow();
	  */
	  
	   ExecutorService executorService2 =   
			   Executors.newFixedThreadPool(5);
	   
	   
	
		  
		  executorService2.execute(new MyThread("Thread 1 "));
		  executorService2.execute(new MyThread("Thread 2 "));
		  executorService2.execute(new MyThread("Thread 3 "));
		  
		  executorService2.execute(new MyThread("Thread 4 "));
		  executorService2.execute(new MyThread("Thread 5 "));
		  executorService2.execute(new MyThread("Thread 6 "));
		  
		  Future<String> sonuc =  executorService2.submit(new MyCallable());
		  	  
		  try {
			  Thread.sleep(1000*10);
			System.out.println( "   --------  " + sonuc.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  executorService2.shutdown();
		  
		  
		  
	
		  
		//  executorService2.execute(new MyThread("Thread 7 "));

	}

}
