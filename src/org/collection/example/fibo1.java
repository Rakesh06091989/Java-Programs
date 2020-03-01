package org.collection.example;

import java.io.Console;
import java.util.Scanner;

public class fibo1 {
	
	public static void fibo(int x,int y,int limit,int count)
	{
		int z = x + y;
		System.out.print(z+" ");
		x=y;
		y=z;
		if(count!=limit)
		{
			count++;
			fibo(x,y,limit,count);
		}
		else
		{
			System.out.println("nth number is"+z);
		}
		
	}

	public static void main(String[] args) {
	
		int a=0,b=1;
		int count = 3;
		Scanner in1 = new Scanner(System.in);
		//Scanner mn = new Scanner(Syste);
		//Console in = System.console();
		System.out.println("Enter the number");
		int limit = in1.nextInt();
		System.out.print(a);
		System.out.print(b);
		fibo(a,b,limit,count);
	}

}