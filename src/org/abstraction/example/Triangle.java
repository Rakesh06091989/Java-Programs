package org.abstraction.example;

public class Triangle/* implements Shape if implement a interface than you should implement all the method of it
 other wise it will give error.*/
{ 

	public void draw()
	{
	   System.out.println("draw method from Triancle");
	}
	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
		tr.draw();
	}

}
