package org.rakesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SortEmpComparable {

	public static void main(String[] args) {
		
		ArrayList<Emplyee> empList = new ArrayList<>();
		//CopyOnWriteArrayList<Emplyee> empList = new CopyOnWriteArrayList<>();
		Emplyee emp1 = new Emplyee(101, "Rakesh", "Akola", 27);
		Emplyee emp2 = new Emplyee(102, "Rakesh", "Thumar", 25);
		Emplyee emp3 = new Emplyee(103, "Harshad", "Thumar", 26);
		Emplyee emp4 = new Emplyee(101, "Naren", "Patel", 28);
		Emplyee emp5 = new Emplyee(105, "Sheetal", "Bhuva", 26);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		Collections.sort(empList);
		//Collections.sort(empList, new NameAgeComparator());
		
		Iterator<Emplyee> itr = empList.iterator();
		while (itr.hasNext()) {
			Emplyee emp = itr.next();
			//empList.add(emp5);
			System.out.println(emp);
			
		}
		Iterator<Emplyee> itr1 = empList.iterator();
		while (itr.hasNext()) {
			Emplyee emp = itr1.next();
			//empList.add(emp5);
			System.out.println(emp);
			
		}

	}

}
