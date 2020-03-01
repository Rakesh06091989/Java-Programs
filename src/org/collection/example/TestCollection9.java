package org.collection.example;

import java.util.*;  
public class TestCollection9{  
public static void main(String args[]){  
  

	//HashSet hl = new HashSet();
	LinkedHashSet hl = new LinkedHashSet();
	//TreeSet hl=new TreeSet();
	//PriorityQueue<String> hl = new PriorityQueue<String>();
	/*hl.add("Rakesh");
	hl.add("Meera");
	//hl.add(null);
	hl.add("Ajay");
	hl.add("Rakesh");
	hl.add("Naren");
	hl.add("Raju");*/
	//hl.add(10);
	//hl.add(20);
	//hl.add(30);
	hl.add("A");
	hl.add("B");
	hl.add("C");
	//hl.remove("Naren");
	//System.out.println("peak element:"+hl.element());
	Iterator itr = hl.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}  
}  