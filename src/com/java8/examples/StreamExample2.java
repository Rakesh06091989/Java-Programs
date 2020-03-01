package com.java8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamExample2 {

  public static Predicate<Person> isAdultMale() {
    return p -> p.getAge() > 21 && p.getLastName().equalsIgnoreCase("Thumar");
  }

  public static void main(String args[]) {

    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Taiz", "Akbani", 32));
    persons.add(new Person("Rakesh", "Thumar", 28));
    persons.add(new Person("Meera", "Thumar", 26));
    persons.add(new Person("Naren", "Patel", 27));
    persons.add(new Person("Sheetal", "Undhad", 28));
    persons.add(new Person("Mahesh", "Chitroda", 29));
    persons.add(new Person("Harshad", "Thumar", 27));
    persons.add(new Person("Shradha", "Kapoor", 25));
    persons.add(new Person("Shradha", "Kapoor", 27));

    HashSet<Person> personsSet = new HashSet<>(persons);

    personsSet.stream().sorted(Comparator.comparing(Person::getLastName)).forEach(System.out::println);

    System.out.println("--------------------Use of reduce----------------------------");
    personsSet.stream().map(Person::getFirstName).reduce((x, y) -> x + "," + y).ifPresent(System.out::println);

    List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
    int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2, (p, q) -> p * q);
    System.out.println(res);

    System.out.println("--------------------Use of predicate----------------------------");
    persons.stream().filter(isAdultMale()).forEach(System.out::println);

    System.out.println("--------------------Use of method reference----------------------");
    List<Integer> ages = persons.stream().map(Person::getAge).filter(x -> x > 26)
        .collect(Collectors.toCollection(ArrayList::new));
    ages.forEach(x -> System.out.println(x + ","));

    persons.stream().map(Person::getLastName).sorted().collect(Collectors.toCollection(LinkedHashSet::new)).forEach(
        System.out::println);

    persons.forEach(person -> {
      if (person.getAge() == 25) {
        person.setAge(26);
      }
    });

    persons.forEach(System.out::print);
    System.out.println("--------------------convert list to Map----------------------------");
    HashMap<String, Person> personsMap = (HashMap<String, Person>) persons
        .stream()
        .collect(Collectors.toMap(Person::getFirstName, p -> p, (oldValue, newValue) -> newValue));

    System.out.println("--------------------Map traversal-----------------------");
    personsMap.forEach((x, y) -> System.out.println("key:" + x + ":value" + y));


  }

}
