package org.collection.example.comparable;

import java.util.*;
import java.io.*;  



class Student implements Comparable{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Object obj){  
Student st=(Student)obj;  
if(rollno==st.rollno)  
return 0;  
else if(rollno>st.rollno)  
return 1;  
else  
return -1;  
}  
  
}  

class AgeComparator implements Comparator{  

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		if(s1.age==s2.age) 
		{	
		    return new NameComparator().compare(s1, s2);
		}
		else if(s1.age>s2.age) 
		{
		return 1;  
		
		}
		else{  
		return -1;
		}
	}

	 
	}

class NameComparator implements Comparator{ 
	


@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	  
	return s1.name.compareTo(s2.name);
}  
}  

  
public class TestSort3{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Rakesh",21));
al.add(new Student(104,"Jai",21));
  
//Collections.sort(al,new AgeComparator());
//Collections.sort(al,new NameComparator());
Collections.sort(al);

 
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Student st=(Student)itr.next();  
System.out.println(st.rollno+""+st.name+""+st.age);  
  }  
}  
}  
