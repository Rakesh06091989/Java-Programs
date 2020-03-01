package org.programs.interview;

import java.io.Serializable;

public class SingletonEx implements Serializable,Cloneable{
	
	public static SingletonEx obj;
	
	static {
		obj = new SingletonEx();
	}
	private static class SingletonHelper{
		private static final SingletonEx exm = new SingletonEx();
	}
	private SingletonEx(){
		if(SingletonEx.obj!=null){
			throw new InstantiationError("Object Creation of this class os not allowed");
		}
	}
	@Override
	public Object clone(){
		return obj;
	}
	public Object readResolve(){
		return obj;
	}
	public static SingletonEx getInstance(){
		return obj;
	}

	public static void main(String[] args) {
		
		System.out.println("Object of Singleton class"+obj.hashCode());
		//SingletonEx single = new SingletonEx(); creation of object is not allowed
		SingletonEx exp = (SingletonEx) obj.clone();
		System.out.println("Object of Singleton class"+exp.hashCode());
	}

}
