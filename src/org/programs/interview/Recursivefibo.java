package org.programs.interview;

public class Recursivefibo {

	public void fibbo1(int n1,int n2)
	{
		int n3;
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		if(n3<=100)
		{
			fibbo1(n1,n2);
		}
	}
	public static void main(String[] args) {
		int x = 0;
		int y =1,z=0;
		for(int i=0;i<=10;i++)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print(z+",");
		}
		System.out.println("");
		Recursivefibo tst = new Recursivefibo();
		tst.fibbo1(0,1);
	}
}