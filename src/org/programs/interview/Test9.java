package org.programs.interview;

import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
		
		String st = "zjdanbc";
		char temp;
		char a[] = st.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
		String original = new String(a);
		System.out.println("larget element from array is:"+original);
	}

}
