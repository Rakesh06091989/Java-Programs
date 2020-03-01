package org.programs.interview;

import java.util.Scanner;

public class Test18 {

 
	static void chg(int[] z)
	{
		z[0]=z[4];
	}
	public static void main(String[] args) {
	
		int a[] ={1,2,3,4,5};
		Test18.chg(a);
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}

}
