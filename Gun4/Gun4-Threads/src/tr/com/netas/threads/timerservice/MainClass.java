package tr.com.netas.threads.timerservice;

import java.util.concurrent.FutureTask;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyCallable c = new MyCallable();
	
		FutureTask<String> future = new FutureTask<>(c);
		
	/*
		
		String test =   future.get();
		
		System.out.println(test);*/
		
		
	}

}
