package org.programs.interview;

import java.util.Scanner;


public class Arrayex {
	

public static void main(String[] args){
	
	int a[]={2,3,4,2,6,2,5,1,9,12};
	int i,j,max=0,b=0;
	int k[] = new int[a.length-2];
	for(i=0;i<a.length;i++)
	{
		max=a[i];
		if(a.length>=i+3)
		{
		for(j=i;j<i+3;j++)
		{
			//System.out.print(a[j]);
			
				if(max<a[j])
				{
					max=a[j];
				}
			
		}
		k[b]=max;
		//System.out.println("");
		System.out.println("maximum value"+k[b]);
		b++;
		}
		else
		{
			break;
		}
	}
  
	for(i=0;i<k.length;i++)
	{
		System.out.print(k[i]+",");
	}

}
}