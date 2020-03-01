package org.collection.example;

import java.util.*;

public class TestCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<String> al = new ArrayList<String>();
		LinkedList<String > al = new LinkedList<String>();
		al.add("Rakesh");
		al.add("Meera");
		al.add(1,"Thumar");
		al.add("Rakesh");
		al.remove(0);
		//ArrayList<String> al1 = new ArrayList<String>();
		LinkedList<String > al1 = new LinkedList<String>();
		al1.add("Vibha");
		al1.add("Savaliya");
		al.addAll(al1);
		//Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		itr.remove();
		}
		//al.retainAll(al1);
		/*System.out.println(al);*/
		System.out.println("------------------------------------");
		for(String obj:al)
		{
			System.out.println(obj);
		}
	}

}
