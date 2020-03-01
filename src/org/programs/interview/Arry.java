package org.programs.interview;

import java.util.Scanner;

public class Arry {

 
	public static void main(String[] args) {
	
		System.out.println("this is array program");
		int a[] ={6,2,1,4,5};
		int i,j,temp=0,count=0;
		int p = a.length - 1;
		for(i=0;i<a.length;i++)
		{
			j=i;
			while(p>=j)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					for(int k=i;k<p;k++)
					{
						a[k]=a[k+1];
						System.out.println(" "+k+a[k]);
					}
					System.out.println(" ");
					count++;
					a[p]=temp;
					j=i;
					for(int h=0;h<a.length;h++)
					{
						System.out.println(a[h]);
					}
				}
				else
				{
					j++;
				}
				System.out.println("infite"+i+j+p);
			}
		}
		System.out.println("Number of instruction"+count);
		
	}

}
