package org.programs.interview;

import java.util.Scanner;

public class Test11 {

 
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to check:");
		int r = in.nextInt();
		int count=1;
		for(int i=1;i<=r;i++)
		{
			count *=i;
		}	
		System.out.println("Factorial of given number is:"+count);
		
	}

}
