package org.collection.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class TreeMapSorting {

    public static void main(String[] args) {

    	Employee emp1 = new Employee(1,"Rakesh","Sankali",29);
    	Employee emp2 = new Employee(2,"Meera","Morwada",27);
    	Employee emp3 = new Employee(3,"Naren","Palanpur",28);
    	Employee emp4 = new Employee(4,"Harshad","Surat",28);
         TreeMap<Employee, String> tmap = new TreeMap();
         tmap.put(emp1, "Thumar");
         tmap.put(emp2, "Savaliya");
         tmap.put(emp3, "Patel");
         tmap.put(emp4, "Surati");
         
         tmap.forEach((k,v) ->{
        	 System.out.println("key: "+k.toString()+"value: "+v);
         });
    }
}