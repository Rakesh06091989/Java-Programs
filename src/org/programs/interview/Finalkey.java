package org.programs.interview;

import java.util.Scanner;

public class Finalkey {

	final int speedlimit;//final variable  
	
	Finalkey(int a)
	{
		speedlimit = a;
	}
	
/*	void run(){  
	  speedlimit=400;  
	 }*/ //it will give compile time error.  
	
	public static void main(String[] args) {
	
		Finalkey fn = new Finalkey(10);
		Finalkey fn1 = new Finalkey(50);
		System.out.println(fn.speedlimit);
		System.out.println(fn1.speedlimit);
		
	}

}
