package org.programs.interview;

public class Test2 {

	public static void main(String[] args) {
		int num = 50;
		int count =0;
		int i,j;
		for(i=1;i<=num;i++)
		{
			count = 0;
		   for(j=2;j<=i/2;j++)
		   {
			   if(i%j==0)
			   {
				   count++;
				   break;
			   }
		   }
		   if(count==0)
		   {
			   System.out.println(i);
		   }
		}
	}

}
