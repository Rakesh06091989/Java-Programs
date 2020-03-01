package org.inputoutput.example;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class Compress {
	public static void main(String args[]){  
		  
		try{  
		FileInputStream fin=new FileInputStream("abc.txt");  
		  
		FileOutputStream fout=new FileOutputStream("abc1.txt");  
		DeflaterOutputStream out=new DeflaterOutputStream(fout);  
		  
		int i;  
		while((i=fin.read())!=-1){  
		System.out.write((byte)i);  
		System.out.flush();  
		}  
		  
		fin.close();  
		out.close();  
		  
		}catch(Exception e){System.out.println(e);}  
		System.out.println("rest of the code");  
		}  

}
