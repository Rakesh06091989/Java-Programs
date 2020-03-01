package org.programs.interview;

import java.util.Scanner;

public class Test17 {
	
	String reverse = "";
	
	public String reverseString(String s1)
	{
	
		if(s1.length() < 1){
            return reverse;
		}else{
		reverse = reverse + s1.charAt(s1.length()-1) + reverseString(s1.substring(0,s1.length()-1));
			return reverse;
		}
		
	}

 
	public static void main(String[] args) {
	
		String abc = "rakesh";
		char a[] = abc.toCharArray();
		StringBuffer stf = new StringBuffer();
		for (int i=abc.length()-1;i>=0;i--)
		{
			stf.append(a[i]);
			
		}
		System.out.println("Reverse string is:"+stf);
		
		Test17 test = new Test17();
		System.out.println("Reverse the string using recursion:"+test.reverseString("RAKESH"));
		
	}

}
