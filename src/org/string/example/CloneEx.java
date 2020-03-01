package org.string.example;

import java.util.ArrayList;
import java.util.List;

public class CloneEx implements Cloneable{

	int id;
	String name;
	Directions dir;
	List<String> list;
	
	public CloneEx(int id,String name,Directions dir, List<String> list) {
		super();
		this.id = id;
		this.name=name;
		this.dir=dir;
		this.list = list;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rakesh");
		list.add("Manish");
		CloneEx obj = new CloneEx(1, "Thumar",Directions.EAST,list);
		System.out.println(obj.id+" " + " "+ obj.dir+obj.name.hashCode()+" "+obj.list.hashCode());
		CloneEx obj2 = (CloneEx) obj.clone();
		
		System.out.println(obj2.id+" " + obj2.dir+obj2.name.hashCode()+" "+obj2.list.hashCode());
		
	}

}
