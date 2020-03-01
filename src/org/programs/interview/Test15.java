package org.programs.interview;

import java.util.Scanner;

public class Test15 {

	static int a = 5;
	String s ="rakesh";
	
	public Test15(){
		
		System.out.println("static2");
	}
	{ System.out.println("this instance initializer block");
	s="meera";
	a=600;
	}
	static 
	{
		a = 500;
		System.out.println("static");
	}
	static
	{
		System.out.println("static1");
	}
	public static void main(String[] args) {
	
		Test15 tr = new Test15();
		tr.rakesh();
		//System.out.println(null);
		
	}
	public void rakesh()
	{
		System.out.println("static3");
		System.out.println("static3"+a+s);
	}
	static
	{
		System.out.println("static last");
	}
}
