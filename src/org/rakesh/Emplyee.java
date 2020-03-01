package org.rakesh;

import java.util.Comparator;

public class Emplyee implements Comparable<Emplyee>{
	
	 int id;
	 String fname;
	 String lname;
	 int age;
	public Emplyee(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	@Override
	public int compareTo(Emplyee o) {
		//---------------------------------------------------------------
		//first it will check on fname then last name
		 if(fname.compareTo(o.fname) == 0){
			return lname.compareTo(o.lname);
		}
		else{
			return fname.compareTo(o.fname);
		}
		//---------------------------------------------------------------
		/*first it will check on id then it will check based on age
		 * if(id == o.id){
			if(age == o.age){
				return 0;
			}
			else if(age>o.age){
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else if(id>o.id){
			return 1;
		}
		else{
			return -1;
		}*/
		//---------------------------------------------------------------
		
/*		if(id == o.id){
			return fname.compareTo(o.fname);
		}
		else if(id>o.id){
			return 1;
		}
		else{
			return -1;
		}*/
		//---------------------------------------------------------------

	}
	/*@Override
	public int compareTo(Emplyee o) {
		
		if(id == o.id){
			if(age == o.age){
				return 0;
			}
			else if(age>o.age){
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else if(id>o.id){
			return 1;
		}
		else{
			return -1;
		}
	}*/
	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}

class NameAgeComparator implements Comparator<Emplyee>{

	@Override
	public int compare(Emplyee o1, Emplyee o2) {
		
		return o1.age - o2.age;
	}
	
}

