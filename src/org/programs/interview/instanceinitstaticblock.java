package org.programs.interview;
class ABC
{
	public void display()
	{
		System.out.println("method from the ABC class");
	}
}
class BC extends ABC{  
	BC(){  
		this(5);
		System.out.println("parent class constructor invoked");
		super.display();
	}
	BC(int a){
		System.out.println("value of parameter"+a);
	}
	static{
		System.out.println("this is the static block of parent class");
	}
	{ System.out.println("this is the instant initializer block of parent class"); }
}  
  
public class instanceinitstaticblock extends BC{  
instanceinitstaticblock(){  
//super();  compiler automatically put super keyword
	//super.super.display(); here it will give compile time error
System.out.println("child class constructor invoked");  
}  
  
instanceinitstaticblock(int a){  
super();  
System.out.println("child class constructor invoked "+a);  
}  
  
{System.out.println("instance initializer block is invoked from instanceinitstaticblock");}  
  
static{
	System.out.println("this is the static block of child class");
	//static block belongs to the class so it will call only once.
}
public static void main(String args[]){  
instanceinitstaticblock b1=new instanceinitstaticblock();  
//instanceinitstaticblock b2=new instanceinitstaticblock(10); //static block invoked only once it will not every time when you create object.
//b1.display();//here with using object we can call super to super class method

}  
} 
