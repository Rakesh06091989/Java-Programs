package org.programs.interview;

import java.util.Scanner;

public class SwapNumber {
	
	public static void swapnumber(int x , int y)
	{
		System.out.println("number after swapping X:"+x+"Y:"+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("number after swapping X:"+x+"Y:"+y);
	}
	public static void main(String a[]){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of X:");
		int x = in.nextInt();
		System.out.println("Enter the value of Y:");
		int y = in.nextInt();
		SwapNumber.swapnumber(x, y);
		in.close();
		
	}

}
