package org.programs.interview;

public class Test7 {

	public static void main(String[] args) {
		
		int a[]={23,14,20,35,12};
		int b=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(b<a[i])
			{
				b=a[i];
			}
		}
		System.out.println("larget element from array is:"+b);
	}

}
