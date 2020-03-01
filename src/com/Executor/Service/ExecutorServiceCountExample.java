package com.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class ExecutorServiceCountExample {

	static volatile int count = 0;

	ReentrantLock lock = new ReentrantLock();
	
	synchronized void increment() {
		 lock.lock();
		    try {
		        count++;
		    } finally {
		        lock.unlock();
		    }
	}

	static void count() {
		count = count + 1;
	}

	public static void main(String args[]) throws InterruptedException {

		ExecutorServiceCountExample ex = new ExecutorServiceCountExample();
		ExecutorService executor = Executors.newFixedThreadPool(2);
		AtomicInteger atomicInt = new AtomicInteger(0);
		IntStream.range(0, 10000).forEach(i -> executor.submit(ExecutorServiceCountExample::count));
		IntStream.range(0, 10000).forEach(i -> executor.submit(atomicInt::getAndIncrement));
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println(ex.count);
		System.out.println(atomicInt.get());
	}
}
