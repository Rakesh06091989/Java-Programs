package org.method.overing.overloading;

public class Employee extends Person{
	
	public int a=70;
	public Employee()
	{
		//super(20);
		System.out.println("spped method from Employee class");
	}

	public void speed(String i,int p)
	{
		System.out.println("spped method from Employee class");
		//return p;
		
	}
	public long speed(long speed)
	{
		System.out.println("spped method from person class"+speed);
		return speed;
		//System.out.println("spped method from person class"+speed);
	}
	private void eat()
	{
		System.out.println("eat method from person class");
	}
	public static void walk()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		
		Person pr = new Employee();
		Person pr1 = new Person();
		Employee a =null;
		a.walk();
		((Employee)pr).speed("Rakesh",26);
		//pr.speed("Meera",24);

		System.out.println("the value of a is pr"+pr.a);
		System.out.println("the value of a is pr1"+pr1.a);
		//System.out.println("the value of a is pr1"+a.a); null pointer exception
	}

}
