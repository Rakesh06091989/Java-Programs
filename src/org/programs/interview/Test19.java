package org.programs.interview;

import java.util.Scanner;

public class Test19 {

 	public static void main(String[] args) {

		for(int j=1;j<=5;j++)
		{
			for(int k=1;k<=5-j;k++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
