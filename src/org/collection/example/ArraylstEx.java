package org.collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class ArraylstEx {

	public static void main(String[] args) {
		
		//ArrayList<Object> arr = new ArrayList<Object>();
		 TreeSet<Object> arr = new TreeSet<Object>();

		 arr.add("l");
		 arr.add(45);
		 arr.add("P");
		 arr.add(23);
		 arr.add(54);
		 arr.add(59);
		 arr.add(77);
		 Iterator<Object> itr = arr.iterator();
		 
/*		 while(itr.hasNext())
		 {
			 Integer a =  (Integer) itr.next();
			 if(a==54){
				 itr.remove();
			 }
			 System.out.println(a);
		 }*/
		 System.out.println("-------------------------------------------");
		 Iterator<Object> itr1 = arr.iterator();
		 while(itr1.hasNext())
		 {
			System.out.println(itr1.next());
		 }


	}

}
