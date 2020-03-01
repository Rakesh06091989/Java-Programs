package org.inputoutput.example;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytearry {

	public static void main(String[] args) throws IOException
	{
	try{  
	     FileOutputStream fout=new FileOutputStream("abc.txt");  
	     String s="Monday,I have java interview";  
	     byte b[]=s.getBytes();//converting string into byte array
	     ByteArrayOutputStream foutbyte = new ByteArrayOutputStream();
	     foutbyte.write(b);
	     foutbyte.writeTo(fout);
	     fout.close();  
	     System.out.println("success...");  
	    }
	   catch(Exception e){System.out.println(e);} 
	 try
	 {
		 FileInputStream fin = new FileInputStream("abc.txt");
		 int i = 0;
		 while((i=fin.read())!=-1)
		 {
			 System.out.print((char)i);
		 }
		 fin.close();
	 }
	 catch(Exception e){System.out.println(e);}
	}
}
