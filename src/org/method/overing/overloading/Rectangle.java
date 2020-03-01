package org.method.overing.overloading;

public class Rectangle extends Triangle{
	
/*	public void draw1()
	{
		System.out.println("static method overridden inside rectangle");
	}*/	//error is like instance method can not override static method
	private void chk()
	{
		System.out.println("its private chk from Rectangle");
	}
	public static void draw1()
	{
		System.out.println("static method overridden inside rectangle");
	}
	public static void draw1(int i)
	{
		System.out.println("rectangle drawn "+i);
	}
	public void draw()
	{
		System.out.println("Rectangle drawn");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle.draw1();
		//here we can not overriding static method because it belongs to class
		Rectangle rt = new Rectangle();
		Triangle tr = new Triangle();
		tr.draw1();
		rt.draw1();
		rt.draw1(5);

	}

}
