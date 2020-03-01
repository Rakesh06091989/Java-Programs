package com.java8.examples;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample1 {
	
	public static void main(String args[]){
		
		ParallelStreamExample1 parallelStreamExample1 = new ParallelStreamExample1();
		System.out.println("Start Timing: "+System.currentTimeMillis());
		parallelStreamExample1.count();
		System.out.println("End Timing: "+System.currentTimeMillis());
		
	}
	public void count() {
		final long count = IntStream.range(1, 500000).parallel()
	            .filter(number -> isPrime(number)).count();
	    System.out.println("Count - " + count);
	}
	public boolean isPrime(final int number) {
	    return number > 1
	            && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(
	                    divisor -> number % divisor == 0);
	}


}
