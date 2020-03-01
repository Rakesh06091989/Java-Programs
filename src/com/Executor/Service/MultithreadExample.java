package com.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultithreadExample {

	public MultithreadExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i = 0;i<10000;i++) {
			ParallelPrinting parallelPrinting = new ParallelPrinting(i);
			executorService.execute(parallelPrinting);
		}
		executorService.shutdown();
		executorService.awaitTermination(5, TimeUnit.SECONDS);
		if(executorService.isTerminated()){
			System.out.println("Printing Task has been completed");
		}

	}

}
