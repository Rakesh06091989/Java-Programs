package com.threading.examples;

public class TestSleepMethod2 extends Thread{

	 public synchronized void run(){  
		  for(int i=10;i<15;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  TestSleepMethod2 t1=new TestSleepMethod2();  
		   
		  t1.start();  
		 // t2.start();  
		 }  
}
