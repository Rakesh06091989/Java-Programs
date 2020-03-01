package org.method.overing.overloading;

public class Person {

	public int a=50;

	public Person()
	{
		System.out.println("default constructor");
	}
	public Person(int b)
	{
		this.a=b;
	}
	private void eat()
	{
		System.out.println("eat method from person class");
	}
	public void speed(String s,int p)
	{
		System.out.println("spped method from person class"+s+p);
	}
	public int speed(int speed)
	{
		System.out.println("spped method from person class"+speed);
		return speed;
		//System.out.println("spped method from person class"+speed);
	}
	public static void main(String[] args) {
	
		Person pr = new Employee();
		Employee em = new Employee();
		pr.eat();
		pr.speed("Rakesh", 26);
		em.speed(25);
		pr.speed(25);
		pr.a=100;
		System.out.println("the value of a is pr"+pr.a);
		System.out.println("the value of a is em"+em.a);
		
	}

}
