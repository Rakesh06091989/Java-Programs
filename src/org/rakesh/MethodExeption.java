package org.rakesh;  

public class MethodExeption{  
	  void msg(){System.out.println("parent");}  
	}  
	  
	class TestExceptionChild extends MethodExeption{  
	  void msg()throws ArithmeticException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
		  MethodExeption p=new TestExceptionChild();  
	   p.msg();  
	  }  
	}