package org.method.overing.overloading;

public class Maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape shp = new circle();//here you just need to change class name so it will call triangle's draw method
		shp.draw();
		//shp.drawfromcircle(); //you can not call any method which inside circle n not defined interface
		//this is best purpose to use method overriding
		Triangle tr = new Rectangle();
		tr.draw1();//it is static method call so called from triangle
		//For class (or static) methods, the method according to the type of reference is called,
		//not according to the object being referred, which means method call is decided at compile time.
		tr.draw1(5);
		tr.draw();//it is instance method so method called from rectangle n overriding happens
		//For instance (or non-static) methods, the method is called according to the type of 
		//object being referred, not according to the type of reference, which means method calls 
		//is decided at run time.
	}

}
