package org.collection.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arrayinit {

	public static void main(String[] args) {
		
		 ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh",""));
				  System.out.println("Elements are:"+obj);
				  if (obj.contains(""))
				  {
					  System.out.println("true");
				  }
				  
				  Iterator itr = obj.iterator();
				  String name ="";
				  while(itr.hasNext()){
					  name = (String) itr.next();
					  if(name.equals("Pratap")){
						  itr.remove();
						 // obj.set(0, "rakesh");
						  //obj.add(1,"Rakesh");
					  }
					  System.out.println(name);
				  }
				  Collections.sort(obj);
				  Iterator itr1 = obj.iterator();
				  while(itr1.hasNext()){
					  System.out.println(itr1.next());
				  }
				  System.out.println("\n");
				  CopyOnWriteArrayList<String> cplist= new CopyOnWriteArrayList<String>(Arrays.asList("rakesh", "naren", "Harsh"));
				  
				  //Collections.sort(cplist);
				  Iterator itr2 = cplist.iterator();
				  while(itr2.hasNext()){
					  name = (String) itr2.next();
					  if(name.equals("naren")){
						  cplist.add(3,"Sheetal");
					  }
					  if(name.equals("rakesh")){
						  cplist.set(1, "meera");
					  }
					  System.out.println(name);
				  }
				  System.out.println(cplist);
	}

}
