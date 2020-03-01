package org.programs.interview;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
/*
class flower{
	String name;
	
	flower(String name){
		this.name = name;
	}
}


interface BaseA{
	
}

class BaseB implements BaseA{
	
	public void do1(){
		
	}
}

class BaseC extends BaseB implements BaseA
*/
public class B1 {


	public static void main(String args[]){
		
/*		HashMap<flower, String> hmap = new HashMap<>();
		
		hmap.put(new flower("meera"), "meera");
		flower f2 = new flower("meera");
		System.out.println(hmap.get(f2));*/
		
		String s = "123.23456abcd";
		NumberFormat n1 = NumberFormat.getInstance();
		n1.setMaximumFractionDigits(2);
		//System.out.println(n1.parse(s));
		
		Double d1 = new Double("2.0");

		Double d2 = new Double("2.00");
		
		BigDecimal bc1 = new BigDecimal("2.0");
		

		BigDecimal bc2 = new BigDecimal("2.00");
		
		
		System.out.println(d1.equals(d2)+ " "+ bc1.equals(bc2));
		
		
		
		String[] str ={"abc"};
		
		try {
			process(str);
			
		}
		catch(Exception e){
			
		}
			System.out.println("Rakesh");
			process(str);
		}
		
		static int process(String[] str){
			return Integer.parseInt(str[0]);
		}

	}
