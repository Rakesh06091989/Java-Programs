package org.serialization.examples;

import java.io.Serializable;
import java.io.*; 

public class Student extends School implements Serializable
{
	public static final long serialVersionUID = 42L;
	int id;  
	String name; 
	static String lname;
	static int age; //Now it will not be serialized
	//int age;
	EagerInitializedSingleton singleton;
	Address addr;
	public Student() {
		super();
		this.no = 105;
	}
	  Student(int id, String name,int age,String lname,Address addr,EagerInitializedSingleton singleton) {  
		  //this.no = 105;
	  this.id = id;  
	  this.name = name; 
	  this.lname=lname;
	  this.age=age;  
	  this.addr=addr;
	  this.singleton=singleton;
	 }  
}
 

