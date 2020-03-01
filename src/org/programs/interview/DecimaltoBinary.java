package org.programs.interview;

import java.util.Scanner;

public class DecimaltoBinary {
	
	public static void decimaltoBinary(int number){
	
		int binary[] = new int[25];
		 int index =0;
		 while(number>0){
			 binary[++index] = number%2;
			 //System.out.println(binary[index]);
			 number = number/2;
		 }
		 for(int i = index;i>0;i--)
		 {
			 System.out.print(binary[i]);
		 }
	}
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = in.nextInt();
		DecimaltoBinary.decimaltoBinary(number);
		in.close();
	}

}
