package org.rakesh;

 class TestSleepMethod2 /*implements Runnable*/ extends Thread {
	public void run(){  
		  for(int i=101;i<105;i++){  
		   try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }
}
public class TestSleepMethod1 /*implements Runnable*/ extends Thread {
	public void run(){  
		  for(int i=1;i<5;i++){  
		   try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  TestSleepMethod1 t1=new TestSleepMethod1();  
		  TestSleepMethod2 t2=new TestSleepMethod2();
		  //TestSleepMethod1 t3=new TestSleepMethod1();
		   
		  t1.start(); 
		 // try{Thread.sleep(50000);}catch(InterruptedException e){System.out.println(e);} 
		  t2.start();
		  t2.yield();
		 // t3.start();
		  //t1.start();
		  //try{t1.start();}catch(IllegalThreadStateException e){ System.out.println(e);}
		  
		 }
	/*public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
		TestSleepMethod1 m1=new TestSleepMethod1();  
		Thread t1 =new Thread(m1);  
		t1.start();
		} */ 
	

}
