package com.java8.examples;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		 
		Spliterator<String> spliterator1 = list.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		 
		spliterator1.forEachRemaining(System.out::println);
		 
		System.out.println("========");
		 
		spliterator2.forEachRemaining(System.out::println);
		System.out.println("========");
		System.out.println(spliterator2.estimateSize());
		System.out.println(spliterator2.getExactSizeIfKnown());

	}

}
