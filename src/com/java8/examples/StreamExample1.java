package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
	
	public static void main(String args[]){
		
		Arrays.stream(new int[]{2,4,6,8,10}).map(x -> x*x).average().ifPresent(System.out::print);
	}

}
