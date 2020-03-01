package org.collection.example.comparable;

import java.util.*;  
  
  
public class TestSort1 implements Comparable{
	
	int rollno;  
	String name;  
	int age;  
	TestSort1(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	  
	public int compareTo(Object obj){  
	TestSort1 st=(TestSort1)obj;  
	if(age==st.age)
	{
		if(rollno==st.rollno)
		{
		return 0;  
		}
		else if(rollno>st.rollno)  
		{
		return 1;  
		}
		else
		{
		return -1;  
		}  
	}
	else if(age>st.age)  
	{
	return 1;  
	}
	else
	{
	return -1;  
	}
	}  
	
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(new TestSort1(101,"Vijay",23));  
al.add(new TestSort1(106,"Ajay",27));  
al.add(new TestSort1(105,"Jai",21));  
al.add(new TestSort1(104,"Jai",21));  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
	TestSort1 st=(TestSort1)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
}  
}  