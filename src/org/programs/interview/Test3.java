package org.programs.interview;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	
		/*Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();*/
		
		String name = "MADAM";
		String namerev ="";
		for(int i=name.length()-1;i>=0;--i)
		{
			namerev += name.charAt(i);
		}
		System.out.println("revers string is:"+namerev);
		if(namerev.equals(name))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	
	}
}
