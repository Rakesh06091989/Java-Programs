package org.constuctor.example2;

class Traveller{
	 
	Traveller(int a)
	{
		System.out.println("Traveller is created with "+a);
	}
	public void print(){
		
		System.out.println("print method is called from Traveller class");
	}
}


public class Vehicle extends Traveller{ 
	
	protected Vehicle(){
		super(5);
		System.out.println("Vehicle is created with ");
	}
  
public static void main(String args[]){  
	Vehicle b=new Vehicle(); 
	b.print();
}  
}  