package org.collection.example;

import java.util.*;



public class ColToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		List<Integer> arry = new ArrayList<Integer>();
	      list.add("This "); 
	      list.add("is "); 
	      list.add("a ");
	      list.add("good ");
	      list.add("program.");
	      arry.add(10);
	      arry.add(54);
	      arry.add(34);
	      arry.add(66);
	      arry.add(50);
	      Set<Integer> numberSet = new HashSet<>(arry);
	      Integer a[] = arry.toArray(new Integer[arry.size()]);
	      Integer numberArray[] = numberSet.toArray(new Integer[arry.size()]);
	      String[] s1 = list.toArray(new String[0]); 
	      for(int i = 0; i < s1.length; ++i){
	         String contents = s1[i];
	         System.out.println(contents);
	     } 
	     for(int i = 0;i<a.length;i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     for(int i = 0;i<numberArray.length;i++)
	     {
	    	 System.out.println(numberArray[i]);
	     }
			

	}

}
