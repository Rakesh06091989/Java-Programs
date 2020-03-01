package org.serialization.examples;

import java.io.*;  
class DePersist{  
 public static void main(String args[])throws Exception{  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
 // Student1 s=(Student1)in.readObject(); 
  Student s=(Student)in.readObject(); 
  String a = in.readLine();
  System.out.println(a);
  Address addr = s.addr;
  //addr.readExternal(in);
  EagerInitializedSingleton singleton = s.singleton;
  System.out.println(s.name1+" "+s.no+" "+s.id+" "+s.name+" "+s.lname+" "+s.age + " "+addr.appno+" "+addr.city +" "+addr.pincode);  
  System.out.println("Hashcode value of Singleton class after deserialization"+singleton.hashCode());
  in.close();  
  
  ObjectInputStream in1=new ObjectInputStream(new FileInputStream("f.txt"));
  Student s1=(Student)in1.readObject();
  EagerInitializedSingleton singleton1 = s1.singleton;
  System.out.println("Hashcode value of Singleton class after deserialization"+singleton1.hashCode());
  in1.close(); 
 }  
}  