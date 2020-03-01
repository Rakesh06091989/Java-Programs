package org.hashcode.equal.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,"Rakesh",27);
		Student s2 = new Student(102,"Meera",25);
		Student s3 = new Student(103,"Harshad",26);
		Student s4 = new Student(103,"Naren",26);
		Student s5 = new Student(103,"Harshad",28);
		
		HashMap<Student,String> studentList = new HashMap<>();
		
		studentList.put(s1, "Mumbai");
		studentList.put(s2, "Morvada");
		studentList.put(s3, "Surat");
		studentList.put(s4, "Palanpur");
		studentList.put(s5, "Kandivali");
		studentList.put(null, null);
		
		Set set = studentList.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Student, String> entry = (Entry<Student, String>) itr.next();
			System.out.print("KEY:"+entry.getKey()+" ");
			System.out.println("Value:"+entry.getValue());
		}

	}

}
