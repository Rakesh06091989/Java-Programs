package org.constuctor.example1;

import org.constuctor.example2.*;

public class Bike1 extends Vehicle{  
Bike1()
{
	//super();
	this(5);
	System.out.println("Bike is created");
	
}  
Bike1(int a){
	System.out.println("Bike is created with "+a);
}
public static void main(String args[])
{  
	//Vehicle v = new Vehicle();
	Vehicle v1 = new Bike1();
//Bike1 b=new Bike1(); 
v1.print();
//b.print();
//Vehicle vh = new Vehicle(); you can not create object of vehicle class 
//because it has protected constructor so you can extend that 
//class outside package but can't create object outside package.

}  
}  