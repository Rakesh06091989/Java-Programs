package org.programs.interview;

public class Test4 {

	public static void main(String[] args) {
	
		int num=1234;
		int rem,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rem+(rev*10);
			num=num/10;
		}
		
			System.out.println("Reversse of that number is:"+rev);
			
	}
}
