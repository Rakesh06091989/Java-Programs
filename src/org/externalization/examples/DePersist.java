package org.externalization.examples;

import java.io.*;

  
class DePersist{  
 public static void main(String args[])throws Exception{  
	
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.ser"));  
/* Employee emp = (Employee) in.readObject();*/
  Employee emp = new Employee();
  emp.readExternal(in);
  System.out.println("Name of Employee"+emp.name);
  System.out.println("Employee salary"+emp.salary);
  System.out.println("Employee Age"+emp.age);
  System.out.println("Employee Cardnumber"+emp.cardNo);
  System.out.println("Employee Address"+emp.addr);
  in.close();  
 }  
}  