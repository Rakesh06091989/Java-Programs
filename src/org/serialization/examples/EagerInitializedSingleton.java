package org.serialization.examples;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class EagerInitializedSingleton implements Serializable{
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    private EagerInitializedSingleton readResolve() throws ObjectStreamException{
    	  return instance;
    	 }
}
