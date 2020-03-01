package org.programs.interview;

import java.util.Scanner;


public class Arrayex2 {
	
public int dtDiff()
{
	String a[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	int days[] ={31,28,31,30,31,30,31,31,30,31,30,31};
	String inp1 = "01-Jan-2015";
	String inp2 = "31-DEC-2016";
	int dd1 = Integer.parseInt(inp1.substring(0,2));
	int month1=0;
	String mm1 = inp1.substring(3,6);
	int yy1 = Integer.parseInt(inp1.substring(7));
	int dd2 = Integer.parseInt(inp2.substring(0,2));
	String mm2 = inp2.substring(3,6);
	int month2=0;
	boolean leapChk=false;
	int yy2 = Integer.parseInt(inp2.substring(7));
	int totalDays = ((yy2-yy1)-1)*365;
	for(int i=yy1+1;i<yy2;i++)
	{
		leapChk=leapYrchk(i);
		if(leapChk)
		{
			totalDays =+ 1;
			leapChk = false;
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i].equals(mm1))
		{
			month1=i;
			
		}
		if(a[i].equals(mm2))
		{
			month2=i;
		}
	}
	for(int j=month1+1;j<12;j++)
	{
		totalDays = totalDays + days[j];
		if(j==1)
		{
			leapChk= leapYrchk(yy1);
			if(leapChk)
			{
				totalDays +=1;
			}
		}
	}
	System.out.println("Difference between given two date is:--"+totalDays);
	for(int i=0;i<month2;i++)
	{
		totalDays = totalDays + days[i];
		if(i==1)
		{
			leapChk= leapYrchk(yy2);
			if(leapChk)
			{
				totalDays +=1;
			}
		}
	}
	System.out.println("Difference between given two date is:--"+totalDays);
	totalDays=totalDays+dd2;
	totalDays=totalDays+(days[month1]-dd1)+1;
	System.out.println("Difference between given two date is:--"+totalDays);
	return totalDays;
}
public boolean leapYrchk(int year)
{
	boolean leapChk = false;
	if(year%4==0)
	{  
		if(year%100==0)
		{
			if(year%400==0)
			{
				leapChk=true;
			}
		}
		else
		{
			leapChk=true;
		}
	}
	
	
	return leapChk;
}
	
public static void main(String[] args){
	
	Arrayex2 ar = new Arrayex2();
	int totalDays = ar.dtDiff();
	System.out.println("Difference between given two date is:--"+totalDays);
}
}