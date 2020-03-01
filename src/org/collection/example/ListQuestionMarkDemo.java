package org.collection.example;

import java.util.*;



public class ListQuestionMarkDemo {

	
	public static void objectdisplay(List<Object> lst)
	{
		lst.add(23);
		lst.add("Rakesh");
		Iterator dsp = lst.iterator();
		System.out.println("-----------------------------------------------------");
		while(dsp.hasNext())
		{
			System.out.println(dsp.next());
		}
	}
	public static void display(List<?> lst)
	{
		lst.add(null);
		lst.remove(2);
	    Iterator dsp = lst.iterator();
	    System.out.println("-----------------------------------------------------");
		while(dsp.hasNext())
		{
			System.out.println(dsp.next());
		}
	}
	public static void main(String[] args) {
			  
		   LinkedList<Integer> arrlist = new LinkedList<Integer>();
		   // use add() method to add elements in the deque
		   arrlist.add(20);
		   arrlist.add(15);
		   arrlist.add(30);
		   arrlist.add(45);
		   System.out.println("display(List<?> lst) call for integer");
		   display(arrlist);
		   //System.out.println("objectdisplay(List<Object> lst) call for integer");
		   //objectdisplay(arrlist);
		   LinkedList<String> sub = new LinkedList<String>();
		   sub.add("Rakesh");
		   sub.add("Vibha");
		   sub.add("Harshad");
		   sub.add("Naren");
		   System.out.println("display(List<?> lst) call for String");
		   display(sub);
		   //System.out.println("objectdisplay(List<Object> lst) call for integer");
		   //objectdisplay(arrlist);
		   
		   LinkedList<Object> sub1 = new LinkedList<Object>();
		   sub1.add("Rakesh");
		   sub1.add("Vibha");
		   sub1.add("Harshad");
		   sub1.add("Naren");
		   System.out.println("objectdisplay(List<Object> lst) call for object");
		   objectdisplay(sub1);
		   display(sub1);
		   
		   System.out.println("Equality of two object");
		   ListQuestionMarkDemo que = new ListQuestionMarkDemo();
		   
		   Object obj = que;
		   
		   System.out.println(que.equals(obj));
		   System.out.println(obj.equals(que));
		   
	}

}
