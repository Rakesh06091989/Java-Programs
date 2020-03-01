package org.method.overing.overloading;

import java.io.IOException;

public class overloading {

	private void speed(int p) throws IOException
	{
		System.out.println("spped method from person class"+p);
	}	
/*	public static void speed(int p) throws IOException
	{
		System.out.println("spped method from person class"+p);
	}
*/	public int speed(float speed) throws ArithmeticException
	{
		System.out.println("spped method from person class"+speed);
		return (int) speed;
		//System.out.println("spped method from person class"+speed);
	}
	public static void main(String[] args){
	
		
		overloading ov = new overloading();
		try {
			ov.speed(5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//int a = ov.speed(10.5);
	}

}
