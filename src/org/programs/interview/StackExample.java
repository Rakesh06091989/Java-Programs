package org.programs.interview;

import java.util.Stack;

public class StackExample {

	/*
	 * Populates stack and processes digits and expressions. All non-digits are evaluated separately.
	 */
	public static Double processExpression(String expr){
		String[] exprArray = expr.split(" ");
		Stack stack =new Stack();
		for(int i = 0;i<exprArray.length;i++){
			try {
				Double digit = Double.parseDouble(exprArray[i]);
				stack.push(digit);
			} catch(NumberFormatException | NullPointerException e) {
				if(e instanceof NumberFormatException) {
					evaluateExpression(stack,exprArray[i]);
				} else {
					throw new RuntimeException(e);
				}
					
			}			
			
		}
		return (Double) stack.pop();
	}
	
	/*
	 * Performs arithmetic operations based on the given operator.
	 */
	private static void evaluateExpression(Stack stack, String c) {
		Double value1 = (Double) stack.pop();
		Double value2 = (Double) stack.pop();
		switch (c) {
		case "+":
			stack.push(value1+value2);
			break;
		case "-":
			stack.push(value2-value1);
			break;
		case "*":
			stack.push(value1*value2);
			break;
		case "/":
			stack.push(value1/value2);
			break;			
		}
		
	}
	public static void main(String[] args) {
		Double value = StackExample.processExpression("1 2 3");
		System.out.println(value);

	}

}
