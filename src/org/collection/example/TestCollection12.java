package org.collection.example;

import java.util.*;
import java.util.Map.Entry;
 
class TestCollection12{  
public static void main(String args[]){  
  
/*PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
  
System.out.println("iterating the queue elements:");  
Iterator<String> itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
  
queue.remove();  
queue.poll();  
  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  */
	//TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
	LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
    //HashMap<Integer, String> hm = new HashMap<Integer, String>();
    //Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	hm.put(105,"Rakesh");
	hm.put(102,"Harshad");
	hm.put(106,"Naren");
	hm.put(null, "meera");
	//hm.put(null,null);
	hm.put(107,"Naren");
	hm.put(105,"Shital");
	//hm.remove(105);
	System.out.println("value of element:"+hm.get(102));
	 /*for(Map.Entry<Integer,String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  */
	Set set = hm.entrySet();
	Iterator itr = set.iterator();
	
	while(itr.hasNext())
	{
		Entry<Integer, String> er = (Entry<Integer, String>) itr.next();
		System.out.print(er.getKey());
		System.out.println(er.getValue());
	}
}  
}  