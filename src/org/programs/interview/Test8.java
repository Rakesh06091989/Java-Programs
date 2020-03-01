package org.programs.interview;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		
		String st = "zjdanbc";
		char a[] = st.toCharArray();
		Arrays.sort(a);
		String original = new String(a);
		
		System.out.println("larget element from array is:"+original);
	}

}
