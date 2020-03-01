package org.method.overing.overloading;

public class circle implements shape,shape1{

	
	public void draw()
	{
		System.out.println("circle drawn");
	}
	public void drawfromcircle()
	{
		System.out.println("its from circle class");
	}
	
	public static void main(String args[])
	{
		circle cs = new circle();
		//System.out.println(cs.A);
	}
}
