package org.abstraction.example;

import org.method.overing.overloading.shape;

public class Equitriangle extends Triangle implements Shape{

	public void print()
	{
	   System.out.println("print method from Triancle");
	}
	public void draw()
	{
	   System.out.println("draw method from Triancle");
	}
	public static void main(String[] args) {
		
		Equitriangle eq = new Equitriangle();
		eq.print();
		Shape shape = new Equitriangle();
		shape.draw();
	}

}
