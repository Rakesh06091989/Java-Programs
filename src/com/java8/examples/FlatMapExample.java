package com.java8.examples;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;


public class FlatMapExample {

	public static void main(String[] args) {
		
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		java.util.List<String> dataAsString = Arrays.stream(data).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
		
		System.out.println(dataAsString);
		
		System.out.println("-------------------------------------------------------------------------");
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect =
                list.stream()
                        .map(x -> x.getBook())      //Stream<Set<String>>
                        .flatMap(x -> x.stream())   //Stream<String>
                        //.distinct()
                        .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));


	}

}
