package org.rakesh;

class TestJoinMethod1 extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]){  
	 TestJoinMethod1 t1=new TestJoinMethod1();  
	 TestJoinMethod1 t2=new TestJoinMethod1();  
	 TestJoinMethod1 t3=new TestJoinMethod1();
	 t1.start();  
	 /*try{  
	  t1.join(1500);  
	  //t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	  */
	 t3.start();
	 t2.start(); 
	 try {
		t2.join(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 /*t3.start();*/  
	 }  
	}  
/*class TestJoinMethod1 extends Thread{  
	  public void run(){
		  try{  
			    Thread.sleep(500);  
			   }catch(Exception e){System.out.println(e);} 
	   System.out.println("running...");  
	  }  
	 public static void main(String args[]){  
	  TestJoinMethod1 t1=new TestJoinMethod1();  
	  TestJoinMethod1 t2=new TestJoinMethod1();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("id of t1:"+t1.getId());  
	  
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("Sonoo Jaiswal");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
	}  */