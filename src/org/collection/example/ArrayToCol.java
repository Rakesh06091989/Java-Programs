package org.collection.example;

import java.util.*;

public class ArrayToCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Integer a[] = {15,20,60,44,20,77,44};
		 // HashSet<Integer> arrylist = new HashSet<Integer>();
		   LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		   TreeSet<Integer> treeSetValues = new TreeSet<Integer>();
		   //ArrayList<Integer> arrylist = new ArrayList<Integer>();
		   List listFromArray = Arrays.asList(a);
		   Collections.addAll(treeSetValues, a);
		   Collections.sort(listFromArray,Collections.reverseOrder());
		   linkedHashSet.addAll(listFromArray);
		  System.out.println("treeSetValues is"+treeSetValues);
		  System.out.println("listFromArray is"+listFromArray);
		   System.out.println("Size of linkedHashSet: " + linkedHashSet.size());
			
		   // let us print all the elements available in list
		   for (Integer number : linkedHashSet) {
		   System.out.println("Number = " + number);
		   }  
			

	}

}
