package org.collection.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		names.add("Rakesh");
		names.add("Meera");
		names.add("Naren");
		names.add("Sheetal");
		names.add("Harshad");
		names.add("Shradha");
		
		ListIterator<String> listIterator = names.listIterator();
		
		while(listIterator.hasNext()){
			if(listIterator.nextIndex() == 2){
				listIterator.set("Vibha");
			}
			System.out.println("Element in the list"+listIterator.next()+"and Index will be"+listIterator.nextIndex());
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		ListIterator<String> listIterator1 = names.listIterator();
		while(listIterator1.hasNext()){
			System.out.println("Element in the list"+listIterator1.next()+"and Index will be"+listIterator1.nextIndex());
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();
			System.out.println("Element in the list"+name);
			if(name.equals("Harshad")||name.equals("Shradha") ) {
				iterator.remove();
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		Iterator<String> iterator1 = names.iterator();
		while(iterator1.hasNext()){
			System.out.println("Element in the list"+iterator1.next());
		}
		
		HashSet<String> listOfNames = new HashSet<>();
		listOfNames.add("Rakesh");
		listOfNames.add("Meera");
		listOfNames.add("Naren");
		listOfNames.add("Sheetal");
		listOfNames.add("Harshad");
		listOfNames.add("Shradha");
		
		//ListIterator<String> listIteratorNames = listOfNames).listIterator();
		//This will not work
	}

}
