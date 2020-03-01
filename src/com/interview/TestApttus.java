package com.interview;

public class TestApttus {

	public static void main(String[] args) {
		
		try {
			HashMapEx hashMap = (HashMapEx) Class.forName("com.interview.HashMapEx").newInstance();
			hashMap.test();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s1 = "Rakesh";
		String s2 = new String("Rakesh");
		//s2 = s2.intern();
		if(s1 == s2){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}

	}

}
