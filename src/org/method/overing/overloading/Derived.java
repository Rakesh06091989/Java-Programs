package org.method.overing.overloading;

import java.util.Scanner;

class Base {
	 private void fun() {
		 // public void fun() {
			  //void fun() {
	     System.out.println("Base fun");     
	  }
	}
	   
public class Derived extends Base {
	 // private void fun() {
	protected void fun() {
	     System.out.println("Derived fun");  
	  }
	  public static void main(String[] args) {
	      //Derived obj = new Derived();
	      Base obj = new Derived();
	     //obj.fun();//error is here
	      ((Derived)obj).fun();// it will solve the problem
	      
	  }  
	}
//when we override a method at that access modifiers rules for base class and 
//subclass follow same rules which they follow in exception handling.
//subclass method have same of greater access modifiers from its parent.
//if you defind parent as private than subclass method have any modifier but you can create object of 
//tewq	subclass and give them reference to parent class and you can not call