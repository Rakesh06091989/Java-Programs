package com.interview;

import java.io.Serializable;

public class Singleton implements Cloneable,Serializable{
	
	private volatile static Singleton singletonObject; ;
	private Singleton(){
		if(singletonObject!=null){
			try {
				throw new InstantiationException("Not allowed to create object");
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public Singleton clone(){
		return singletonObject;	
	}
	public Singleton readResolve(){
		return singletonObject;
	}
	public static Singleton getInstance(){
		if(singletonObject == null){
			synchronized (singletonObject) {
				if(singletonObject==null){
					singletonObject = new Singleton();	
				}
			}
			
		}
		return singletonObject;
	}
	public static void main(String[] args) {
			Singleton one = getInstance();
			System.out.println(one.hashCode());
			Singleton two = new Singleton();
			Singleton three = one.clone();
			System.out.println(three.hashCode());
	}

}
