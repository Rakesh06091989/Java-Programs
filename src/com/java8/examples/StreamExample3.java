package com.java8.examples;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample3 {
	
	public static void main(String args[]){
		
		IntSummaryStatistics summaryStatistics = IntStream.of(4,56,77,3,6,8).summaryStatistics();
		System.out.println(summaryStatistics);
		
	}

}
