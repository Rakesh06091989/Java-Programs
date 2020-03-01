package org.programs.interview;

import java.util.HashMap;

public class Student18 implements Cloneable{  
int rollno;  
String name;  
  
Student18(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  

public int hashCode()
{
	return name.hashCode();
	
}
  
public static void main(String args[]) {  
//try{  
Student18 s1=new Student18(101,"amit");
Student18 s3=new Student18(101,"amit");

HashMap<Student18,String> st = new HashMap<Student18,String>();
st.put(s1, "Gupta");
st.put(s3, "Kumar");

System.out.println(st.get(s1));

Student18 s2=(Student18)s1;  //here it just giving reference not creating copy of the object
//Student18 s2=(Student18)s1.clone();it require less process than normal copy of the object   
System.out.println(s1.rollno+" "+s1.name); 
s1.name="rakesh";
System.out.println(s2.rollno+" "+s2.name);  
  
//}//catch(CloneNotSupportedException c){}  
  
}  
}  
