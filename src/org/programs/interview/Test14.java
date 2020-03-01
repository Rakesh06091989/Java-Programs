package org.programs.interview;

import java.util.Scanner;

public class Test14 {

 	public static void main(String[] args) {

 		int i;
		for(int j=1;j<=5;j++)
		{
			for(int k=1;k<=5-j;k++)
			{
				System.out.print("  ");
			}
			for(i=1;i<=j;i++)
			{
				System.out.print(i+" ");
			}
			for(int k=j-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}

}
