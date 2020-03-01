package org.programs.interview;

import java.util.Scanner;


public class Atmwith {
	

public static void main(String[] args){
	
	System.out.println("Enter the amount to withdrawal");
	Scanner in = new Scanner(System.in);
	int amt = in.nextInt();
	if(amt%100!=0)
	{
		System.out.println("Enter a valid amount");
		 amt = in.nextInt();
	}
	int amt1000 = amt/1000;
	amt=amt-amt1000*1000;
	int amt500 = amt/500;
	amt = amt-amt500*500;
	int amt100 = amt/100;
	if(amt100==0)
	{
		if(amt500!=0)
		{
		amt100=5;
		amt500=amt500-1;
		}
		else
		{
			amt500=1;
			amt100=5;
			amt1000=amt1000-1;
		}
	}
	System.out.println("-----------Your Transaction slip-----------------");
	if(amt1000!=0)
	{
		System.out.println("1000*"+amt1000+"="+amt1000*1000);
	}
	if(amt500!=0)
	{
		System.out.println("500*"+amt500+"="+amt500*500);
	}
	System.out.println("100*"+amt100+"="+amt100*100);
		
}
}