package org.collection.example;

import java.util.*;




public class HashsetTest {

	public static void main(String[] args) {
		   
		  HashSet<Employee> hashset = new HashSet<Employee>();
		   
		   for(int i=0;i<100;i++){
			   hashset.add(new Employee());
		   }
	
		  System.out.println("Arraylist is: "+hashset.size());
		   
			

	}

}
