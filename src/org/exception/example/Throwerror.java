package org.exception.example;

public class Throwerror {
	
	static void foo()
	{
		try{
			throw new Error();
		}
		catch(Error err){
			System.out.println("in catch block");
		}
		finally{
			System.out.println("in finally block");	
		}
	}
	static void foo1()
	{
		throw new Error();
	}

	public static void main(String[] args) {
		
		foo();
		try{
		foo1();
		}
		catch(Error err){
			System.out.println("called from foo1");
		}
		//System.out.println("Hi");
		
	}

}
