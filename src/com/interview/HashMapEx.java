package com.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapEx {

	public void test(){
		System.out.println("test");
	}
	public static void main(String[] args){
		//HashMap<Fruits,String> hmap = new HashMap<>();
		LinkedHashMap<Fruits,String> hmap = new LinkedHashMap<>();
		Fruits fr1 = new Fruits("Banana", 11, 50);
		Fruits fr2 = new Fruits("Orange", 6, 60);
		Fruits fr3 = new Fruits("Apple", 8, 80);
		Fruits fr5 = new Fruits("Apple", 9, 90);
		Fruits fr4 = new Fruits("Pinaple", 10, 90);
		
		hmap.put(fr1, "First");
		hmap.put(fr2, "Second");
		hmap.put(fr3, "Third");
		hmap.put(fr4, "Fourth");
		hmap.put(fr5, "Fifth");
		
		Set set = hmap.entrySet();
		
		Iterator<Fruits> itr = set.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry<Fruits, String> entry= (Entry<Fruits, String>) itr.next();
			
			System.out.println("Key : "+entry.getKey()+"Value : "+entry.getValue());
		}
	}
}
