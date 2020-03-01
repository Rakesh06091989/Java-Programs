package org.method.overing.overloading;

public class Triangle implements shape{

	private void chk()
	{
		System.out.println("its private chk from Triangle");
	}
	public void draw()
	{
		System.out.println("triangle drawn");
	}
	public static void draw1()
	{
		System.out.println("triangle drawn static overiden");
	}
/*	public void draw1()
	{
		
	}*/
	// you can not overload method using just static keyword
	
	public static void draw1(int i)
	{
		System.out.println("triangle drawn 1"+i);
	}
    public static void main(String[] args)
    {
    	Triangle.draw1();
    	Triangle.draw1(4);//it is best example of method overloading incase of static method
    	Triangle rt = new Rectangle();
    	rt.chk();
    }
}
