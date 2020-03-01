package com.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class SemaphoreExample {


	public static void main(String args[]) throws InterruptedException {


	Semaphore semaphore = new Semaphore(1);
	
	Runnable longRunningTask = () -> {
	    boolean permit = false;
	    try {
	        permit = semaphore.tryAcquire(1, TimeUnit.MICROSECONDS);
	        if (permit) {
	            System.out.println("Semaphore acquired");
	            Thread.sleep(5);
	        } else {
	            System.out.println("Could not acquire semaphore");
	        }
	    } catch (InterruptedException e) {
	        throw new IllegalStateException(e);
	    } finally {
	        if (permit) {
	            semaphore.release();
	            System.out.println("Semaphore released");
	        }
	    }
	};
	ExecutorServiceCountExample ex = new ExecutorServiceCountExample();
	ExecutorService executor = Executors.newFixedThreadPool(2);

	IntStream.range(0, 1000)
	    .forEach(i -> executor.submit(longRunningTask));
			executor.shutdown();
			executor.awaitTermination(10, TimeUnit.SECONDS);
	}
}
