package org.collection.example;

import java.util.*;  
public class TestCollection8{  
public static void main(String args[]){  
  
/*ArrayList<String> al=new ArrayList<String>();  
al.add("Amit");  
al.add("Vijay");  
al.add("Kumar");  
al.add(1,"Sachin");  
  
System.out.println("element at 2nd position: "+al.get(2));  
  
ListIterator<String> itr=al.listIterator();  
  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
  
  
System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious()){  
System.out.println(itr.previous());  
 } 
System.out.println("element at 2nd position: "+al.get(0));*/
	//HashSet<String> hl = new HashSet<String>();
	//LinkedHashSet<String> hl = new LinkedHashSet<String>();
	TreeSet<String> hl=new TreeSet<String>();
	//PriorityQueue<String> hl = new PriorityQueue<String>();
	hl.add("Rakesh");
	hl.add("Meera");
	//hl.add(null);
	hl.add("Ajay");
	hl.add("Rakesh");
	hl.add("Naren");
	hl.add("Raju");
	//hl.remove("Naren");
	//System.out.println("peak element:"+hl.element());
	Iterator<String> itr = hl.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}  
}  