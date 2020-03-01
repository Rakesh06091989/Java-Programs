package org.programs.interview;

import java.util.Scanner;

public class PrimeNumAdd {

 
	public static void main(String[] args) {
	
		System.out.println("Enter the value of N");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int primecount=1,sum=0,i,m=2;
		boolean primechk=true;
		while(true)
		{
			
			primechk=true;
			for(i=2;i<=m/2;i++)
			{
				
				if(m%i==0)
				{
					primechk=false;
					break;
				}
				
			}
			if(primechk)
			{
				sum+=m;
				System.out.println("Prime count::"+primecount);
				System.out.println("Primenumber id::"+m);
				System.out.println("Primenumber Addition::"+sum);
				primecount++;
				
			}
			m++;
			if(primecount>n)
			{
				break;
			}
		}
		
	}

}
