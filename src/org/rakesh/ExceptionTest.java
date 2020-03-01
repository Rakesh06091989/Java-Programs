package org.rakesh;

/*public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try{  
			    int a[]=new int[5];  
			    a[6]=30/5; 
			    System.out.println(a[6]);
			   }  
		   	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 is completed");}
			 //  catch(ArithmeticException e){System.out.println("task1 is completed");}    
			   catch(Exception e){System.out.println("common task completed");}  
			  
			   System.out.println("rest of the code..."); 

	}

}*/
 class TestExceptionChild1{  
	  void msg(){System.out.println("parent");}  
	}  
	  
	public class ExceptionTest extends TestExceptionChild1{  
	  void msg()throws ArithmeticException{  
	    System.out.println("TestExceptionChild");  
	  }  
	  public static void main(String args[]){  
		  TestExceptionChild1 p=new ExceptionTest();  
	   p.msg();  
	  }  
	}
