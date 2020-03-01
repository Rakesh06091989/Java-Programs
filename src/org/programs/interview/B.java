package org.programs.interview;

import java.util.Scanner;

class A{
	 
public int a;
 
public void print(){
 
System.out.println("print method of super class A"); 

}
public void show(){
	 
	 System.out.println("show method of super class A"); 

	} 
}
public class B extends A{
	
	private int a;
	public int c;
 
public void show(){
 
 System.out.println("show method of sub class B"); 

}
public static void main(String[] args){
  
A objRefA= new B();
B objRefB = new B();
//obj.a = 10;
objRefB.a = 30;
objRefA.a =50;
 ((B)objRefA).c=20;
objRefA.print();
objRefB.print();
objRefB.show();//it will give compile time error if show method was not declared in parent class
((B) objRefA).show(); // compile time error if show method is not present in parent class than we need to type cast the object.

 System.out.println("objRefBa="+/*obj.a*/ + objRefB.a); 
 System.out.println("((B)objRefA).c): "+((B)objRefA).c); 
 System.out.println("objRefA.a: "+objRefA.a);

}
}