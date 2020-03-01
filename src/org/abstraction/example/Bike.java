package org.abstraction.example;

class Honda extends Bike{ 
	
void run(){System.out.println("running safely..");}  

}  

public abstract class Bike {

	Bike()
	{
		System.out.println("Constructor from the abstratc class bike");
	}  
	abstract void run();  
	//abstract void speed();
	public static void run1()
	{
		System.out.println("static method from abstract class");
	}
	private void check(){
		System.out.println("Private method testing");
	}
	void changeGear()
	{
		System.out.println("gear changed - method from abstract class and called through subclass object");
	} 
	public static void main(String args[])
	{
		 System.out.println("This is abstract class example");
		Bike bk = new Honda();
		Honda hn = new Honda();
		bk.check();// we can define private method inside abstract class and also call this way
		hn.run1();
		Honda.run1();
		hn.changeGear();
		bk.run();
		bk.changeGear();
	 }
	   
}
