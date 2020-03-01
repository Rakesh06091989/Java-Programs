package org.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Singletone {
	

	public static void main(String []args)
	{
		Employee s1 = new Employee();
		s1.setId(1);
		s1.setName("Rakesh");
		Employee s2 = new Employee();
		s2.setId(1);
		s2.setName("Meera");
		Employee s3 = new Employee();
		s3.setId(3);
		s3.setName("Ramesh");
		Employee s4 = new Employee();
		s4.setId(2);
		s4.setName("Mishra");
		//HashMap<Employee,String> map = new HashMap<Employee,String>();
		TreeMap<Employee,String> map = new TreeMap<Employee,String>();
		//Hashtable<Employee,String> map = new Hashtable<Employee,String>();
		//LinkedHashMap<Employee,String> map = new LinkedHashMap<Employee,String>();
		map.put(s1, "Thumar");
		map.put(s2, "Shahoo");
		map.put(s3, "Patel");
		map.put(s4, "Abhijeet");
		//Collections.sort(list);
		//System.out.println(map.get(s1));
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Employee, String> er = (Entry<Employee, String>) itr.next();
			System.out.print(er.getKey());
			System.out.println(er.getValue());
		}
		System.out.println("-------------------------Map Test End----------------------------");
		//HashSet<Employee> em = new HashSet<Employee>();
	    //LinkedHashSet<Employee> em = new LinkedHashSet<Employee>();
		
		TreeSet<Employee> em = new TreeSet<Employee>();
		em.add(s1);
		em.add(s2);
		em.add(s3);
		em.add(s4);
		
		Iterator itr1 = em.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	
	//TreeSet em1 = new TreeSet();
	//HashSet em1 = new HashSet();
	LinkedHashSet em1 = new LinkedHashSet();
	//ArrayList em1 = new ArrayList();
	em1.add(5);
	em1.add(10);
	em1.add("r");
	em1.add(99);
	em1.add(15);
	em1.add("r");
	em1.add(5);
	//em1.add(null);
		//Collections.sort(em1);
		Iterator itr2 = em1.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
	
}
