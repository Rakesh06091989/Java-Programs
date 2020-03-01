package org.designptrn.example;

public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    	if(instance!=null){

				throw new ArithmeticException("you can't create object");

    	}
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
