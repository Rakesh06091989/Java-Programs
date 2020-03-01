package org.reflection.example;

import java.lang.reflect.*;

import com.interview.Singleton;
class Dummy{
	private String name1 = "rakesh";
	
    private void foo(){
        System.out.println("hello foo()");
    }
}

public class ReflactionTest{
    public static void main(String[] args) throws Exception {
        Dummy d = new Dummy();
        Method m = Dummy.class.getDeclaredMethod("foo");
        //m.invoke(d);// throws java.lang.IllegalAccessException
        m.setAccessible(true);// Abracadabra 
        m.invoke(d);// now its OK
        Field f = Dummy.class.getDeclaredField("name1");
        f.setAccessible(true);
        String name = (String) f.get(d);
        System.out.println(name);
        //Singleton single = new Singleton();
        Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        Singleton single = constructor.newInstance();
        System.out.println(single.hashCode());
    }
}