package org.collection.example;

import java.util.*;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an empty array list with an initial capacity
		   //ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		   LinkedList<Integer> arrlist = new LinkedList<Integer>();
		   // use add() method to add elements in the deque
		   System.out.println(arrlist.add(2));
		   arrlist.add(1);
		   arrlist.add(3);
		   arrlist.add(4);
		   System.out.println(arrlist.get(1));
		   LinkedList<Integer> sub = new LinkedList<Integer>(arrlist.subList(1, 3));
		   System.out.println("Sub list: " + sub);
		   System.out.println("Size of list: " + arrlist.size());
		   System.out.println("2nd element of arraylst:"+arrlist.get(1));
			
		   // let us print all the elements available in list
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }  
			
		   // Removes element at 3rd position
		   arrlist.remove(2);
		   arrlist.remove(null);

		   System.out.println("Now, Size of list: " + arrlist.size());
			
		   // let us print all the elements available in list
		   for (Integer number : arrlist) {
		   System.out.println("Number = " + number);
		   }
	}

}
