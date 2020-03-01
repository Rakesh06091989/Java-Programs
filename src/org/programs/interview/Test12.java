package org.programs.interview;
import java.util.Scanner;

public class Test12 {

 
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to check:");
		int r = in.nextInt();
		int count=0;
		for(int i=2;i<=r/2;i++)
		{
			if(r%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Given number is prime");
		}
		else
		{
			System.out.println("Given number is not prime");
		}
		
		
	}

}
