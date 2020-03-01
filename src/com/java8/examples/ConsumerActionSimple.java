package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class ConsumerActionSimple {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		Consumer<Integer> action = System.out::println;
		
		System.out.println("-------------------------------------------");
		numberList.stream().filter(n -> n%2  == 0).forEach( action );
		
		System.out.println("-------------------------------------------");
		numberList.forEach(action);
		
		HashMap<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		 
		//1. Map entries
		Consumer<Map.Entry<String, Integer>> actionForMap = System.out::println;
		System.out.println("-------------------------------------------");
		map.entrySet().forEach(actionForMap);
		 
		//2. Map keys
		Consumer<String> actionOnKeys = System.out::println;
		System.out.println("-------------------------------------------");
		map.keySet().forEach(actionOnKeys);
		 
		//3. Map values
		Consumer<Integer> actionOnValues = System.out::println;
		System.out.println("-------------------------------------------");
		map.values().forEach(actionOnValues);

		Consumer<Map.Entry<String, Integer>> actionForMapKeyAndValue = entry ->
		{
		    System.out.println("Key is : " + entry.getKey());
		    System.out.println("Value is : " + entry.getValue());
		};
		 
		map.entrySet().forEach(actionForMapKeyAndValue);
		
		List<Integer> prices = new ArrayList<>(Arrays.asList(20,25,45,60));
		List<Integer> updatedPrices = new ArrayList<>();
		
		Iterator<Integer> pr = prices.iterator();
		Consumer<Integer> actionForList = x -> {
			updatedPrices.add(x+5);
		};
		
		prices.stream().forEach(actionForList);
		System.out.println("-------------------------------------------");
		updatedPrices.forEach(action);
	}

}
