package com.java8.examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
	    stack.push("first");
	    stack.push("second");
	    stack.push("third");
	    //System.out.println(stack.poll());
	    System.out.println(stack.pop());

	}

}
