package org.programs.interview;

import java.util.Scanner;

public class RecursiveFact {
	int fact =1;
	
	public int recursiveFact(int number){
		
		if(number == 0){
			return fact;
		}
		else{
		fact = number * (recursiveFact(number-1));
			return fact;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int number = in.nextInt();
		RecursiveFact rcursv = new RecursiveFact();
		int factorial = rcursv.recursiveFact(number);
		System.out.println("factorial of given number:"+factorial);

	}

}