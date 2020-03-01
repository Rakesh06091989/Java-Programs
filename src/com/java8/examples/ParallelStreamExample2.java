package com.java8.examples;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numList = new ArrayList();
        for (int i = 0; i < 1000; i++) {
        	numList.add(i);
        }
 
        // Processing sequentially
        long startTime = System.currentTimeMillis();
        numList.stream().forEach(i -> processData(i));
        long endTime = System.currentTimeMillis();
        double sequentialStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with stream() : " + sequentialStreamTimetaken);
 
        // Parallel processing 
        startTime = System.currentTimeMillis();
        numList.parallelStream().forEach(i -> processData(i));
        endTime = System.currentTimeMillis();
        long parallelStreamTimetaken = (endTime - startTime) / 1000;
        System.out.println("Time required with parallelStream() : " + parallelStreamTimetaken);
        System.out.println("Differential time : " + (sequentialStreamTimetaken - parallelStreamTimetaken));
    }
 
    private static void processData(Object i) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}


}