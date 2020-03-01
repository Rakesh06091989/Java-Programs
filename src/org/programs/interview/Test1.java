package org.programs.interview;
import java.io.*;
import java.io.*;
public class Test1 {

	private static int abc =0;
	//public static final int xyz; static variable can not be initialized inside cons
	public final int xyz;
	public Test1(int i)
	{
		xyz=i;//final variable can be initialized inside constructor.
	}
	public static void main(String[] args) {
		//public static final void main(String[] args) {
		int x = 20;
		int y =40;
		abc=1000;
		System.out.println("The value of x and y:"+x +""+ y);
		x=x+y;
		y=x-y;
		x=x-y;
		Test1 ab = new Test1(200);
		System.out.println("The value of x and y:"+x +""+ y + abc + ab.xyz);
		//System.out.println("The value of x and y:"+x +""+ y + abc + xyz);
		//  you can not display final variable without creation of object
		System.out.println("The value of x and y:"+x +""+ y + abc);
	}

}
