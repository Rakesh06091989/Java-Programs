package org.serialization.examples;

import java.io.Serializable;
//import java.io.*; 

public class Student1 extends School implements Serializable
{
	int id;  
	String name;  
	//transient int age;//Now it will not be serialized
	int age;
	Address addr;
	
	  Student1(int id, String name,int age,Address addr) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	  this.addr=addr;
	 }  
}
 

