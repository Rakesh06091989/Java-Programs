package org.externalization.examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.io.Serializable;

  
	public class ExternalizationDemo {
	       public static void main(String[] args) {
	              Employee emp = new Employee();
	              Address addr = new Address("Thane",1004,400615);
	              emp.name = "Alex";
	              emp.age = 26;
	              emp.salary = 34567.8;
	              emp.cardNo = 65754534;
	              emp.addr = addr;
	              File file = new File("employee.ser");
	              FileOutputStream fos = null;
	              ObjectOutputStream oos = null;
	              try {
	                     fos = new FileOutputStream(file);
	                     oos = new ObjectOutputStream(fos);
	                     emp.writeExternal(oos);
	                     System.out.println("object persisted");
	              } catch (IOException ex) {
	                     ex.printStackTrace();
	              } finally {
	                     try {
	                           if (oos != null) {
	                                  oos.flush();
	                                  oos.close();
	                           }
	                     } catch (IOException ex) {
	                           ex.printStackTrace();
	                     }
	                     try {
	                           if (fos != null) {
	                                  fos.flush();
	                                  fos.close();
	                           }
	                     } catch (IOException ex) {
	                           ex.printStackTrace();
	                     }
	              }
	       }
	}
