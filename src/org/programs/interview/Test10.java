package org.programs.interview;

import java.util.Arrays;


public class Test10 {

	int data=50;  
	  
	 void change(int data){  
	 //data=data+100;//changes will be in the local variable only 
	 this.data=data+100;
	 }  
	 
	public static void main(String[] args) {
	
		Test10 op=new Test10();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(500);  
		   System.out.println("after change "+op.data);  
		
	}

}
