package org.programs.interview;

import java.util.Scanner;

public class GCD {
	
	public static void findLCM(int a,int b)
	{
		int gcdNumber = 1;
		for(int i=1; i<= a && i<=b ;i++)
		{
			
			if(a%i==0 && b%i==0){
				gcdNumber = i;
			}
		}
		System.out.println("GCD of two number "+a+" and "+b+"is : "+gcdNumber);	
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number\n");
		int n1 = in.nextInt();
		System.out.println("Enter the second number\n");
		int n2 = in.nextInt();
		GCD.findLCM(n1, n2);
		in.close();

	}

}
