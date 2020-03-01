package org.programs.interview;

import java.util.Scanner;

public class Test13 {

 
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to check:");
		int r = in.nextInt();
		int n=0,arm=0;
		int p=r;
		while(r>0)
		{
			n=r%10;
			arm=arm+n*n*n;
			r=r/10;
		}
		if(p==arm)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
		
	}

}
