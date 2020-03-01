package org.rakesh;

public class MemoryTest{  
	 public static void main(String args[])throws Exception{  
	  Runtime r=Runtime.getRuntime();  
	  System.out.println("Total Memory: "+r.totalMemory());  
	  System.out.println("Free Memory: "+r.freeMemory());  
	    
	  for(int i=0;i<10000;i++){  
	   new MemoryTest();  
	  }  
	  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
	  System.gc();  
	  System.out.println("After gc(), Free Memory: "+r.freeMemory());  
	  System.out.println("After gc(), availableProcessors: "+r.availableProcessors()); 
	  r.exec("notepad");
	  r.exec("mspaint");
	 }  
	}  