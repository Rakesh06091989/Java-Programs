package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class FruitsSort {

	public static void main(String[] args) {
		ArrayList<Fruits> list = new ArrayList<>();
		Fruits fr1 = new Fruits("Banana", 11, 50);
		Fruits fr2 = new Fruits("Orange", 6, 60);
		Fruits fr3 = new Fruits("Apple", 6, 80);
		Fruits fr4 = new Fruits("Pinaple", 10, 90);
		list.add(fr1);
		list.add(fr2);
		list.add(fr3);
		list.add(fr4);
		list.sort(Comparator.comparing(fruits -> fruits.fruitname));
		list.forEach(fruits -> System.out.println(fruits));
		Collections.sort(list,Collections.reverseOrder());
		Iterator<Fruits> itr = list.iterator();
		
		while(itr.hasNext()){
			Fruits fr = itr.next();
			System.out.println(fr);
		}

	}

}
