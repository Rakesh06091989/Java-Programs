package org.serialization.examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//import java.io.Serializable;

public class PersistExample {  
	 public static void main(String args[])throws Exception{ 
	
	 Address addr = new Address("Thane", 1004 ,400615);
	 EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
	 Student s1 =new Student(211,"ravi",22,"thumar",addr,singleton);//creating object
	  /*School sh = new School("ABC",1234);*/
	  //writing object into file  
	  FileOutputStream f=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(f);  
	  out.writeObject(s1);  
	 /* out.writeObject(sh);*/
	  out.flush();  
	  
	  out.close();  
	  f.close();  
	  System.out.println("value of no"+s1.no);
	  System.out.println("Hashcode value of Singleton class after serialization"+singleton.hashCode());
	  System.out.println("success");  
	 }  
	}