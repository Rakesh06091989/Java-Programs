package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableExtreme {
	
	public static void main(String args[]) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Taiz","Akbani",32));
		persons.add(new Person("Rakesh","Thumar",28));
		persons.add(new Person("Meera","Thumar",26));
		persons.add(new Person("Naren","Patel",27));
		persons.add(new Person("Sheetal","Undhad",28));
		persons.add(new Person("Mahesh","Chitroda",29));
		persons.add(new Person("Harshad","Thumar",27));
		persons.add(new Person("Shradha","Kapoor",27));
		persons.add(new Person("Shradha","Kapoor",25));
		persons.add(new Person("Shradha","Thumar",26));
		
		persons.sort(Comparator.comparing(Person::getAge));
		System.out.println(persons);
		System.out.println("----------------------------------------------");
		persons.stream().sorted(Comparator.comparing(Person::getFirstName)).forEach(p -> System.out.println(p));
		System.out.println("----------------------------------------------");
		Comparator<Person> groupByComparator = Comparator.comparing(Person::getFirstName)
														.thenComparing(Person::getLastName)
														.thenComparing(Person::getAge);
		persons.sort(groupByComparator);
		persons.forEach(p -> System.out.println(p));
		
		System.out.println("----------------------------------------------");
		//Parallel Sorting
		Person[] employeesArray = persons.toArray(new Person[persons.size()]);
		//Parallel sorting
		Arrays.parallelSort(employeesArray, groupByComparator); 
		Arrays.asList(employeesArray).stream().forEach(e -> System.out.println(e));
	}

}
