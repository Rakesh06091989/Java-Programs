package org.hashcode.equal.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(101,"Rakesh",27);
		Student s2 = new Student(102,"Meera",25);
		Student s3 = new Student(103,"Harshad",26);
		Student s4 = new Student(103,"Naren",26);
		Student s5 = new Student(103,"Harshad",28);
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Collections.addAll(studentList, s1,s2,s3,s4,s5);
		
		Iterator itr = studentList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
