package org.programs.interview;

import java.util.Scanner;

public class LCM {
	
	public static void findLCM(int a,int b)
	{
		int maxNumber = (a>b) ? a :b;
		while(true)
		{
			if(maxNumber%a==0 && maxNumber%b==0){
				System.out.println("LCM of two numner "+a+" and "+b+"is : "+maxNumber);
				break;
			}
			++maxNumber;
		}
		
	} //02823220015 , 07574809480 , 09909963734
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number\n");
		int n1 = in.nextInt();
		System.out.println("Enter the second number\n");
		int n2 = in.nextInt();
		LCM.findLCM(n1, n2);
		in.close();
	}

}
