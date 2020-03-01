package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Steam {

	public static void main(String[] args) {
		
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));
        System.out.println("-------------------------------------------");
        Stream<Date> streamDate = Stream.generate(() -> { return new Date(); });
        //streamDate.forEach(p -> System.out.println(p));
        
        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");
         
        List<String> sorted = strings
                .stream()
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println(sorted);
         
        List<String> sortedAlt = strings
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println("-------------------------------------------");
        System.out.println(sortedAlt);
        List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));
        System.out.println("-------------------------------------------");
        integers.stream().reduce(Math::max).ifPresent(System.out::println);
 
        //max.ifPresent(System.out::println); 
	}

}
