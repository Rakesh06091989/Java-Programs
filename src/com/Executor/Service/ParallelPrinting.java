package com.Executor.Service;

public class ParallelPrinting implements Runnable{

	int i;
	public ParallelPrinting(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		System.out.println(i);
		
	}

}
