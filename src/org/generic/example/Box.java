package org.generic.example;

public class Box <T>{
	
	private T t;
	public String name;
	
	 public void add(T t,String name) {
		    this.t = t;
		    this.name=name;
		  }

		  public T get() {
		    return t;
		  }
		  
		  public String getname() {
			    return name;
			  }

	public static void main(String[] args) {
		
		Box<Integer> integerBox = new Box<Integer>();
	     Box<String> stringBox = new Box<String>();
	     
	     Box obj = new Box();
	    obj.add(15,"rakesh");
	     /*integerBox.add(new Integer(10));
	     stringBox.add(new String("Hello World"));*/
	     integerBox.add(10,"rakesh");
	     stringBox.add("Hello World","Meera");

	     System.out.printf("Integer Value :%d\n\n", integerBox.get());
	     System.out.printf("String Value :%s\n", stringBox.get());
	   //  System.out.printf("Integer Value :%d\n\n", integerBox.getname());
	     System.out.printf("String Value :%s\n", stringBox.getname());
	}

}
