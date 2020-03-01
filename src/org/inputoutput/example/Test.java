package org.inputoutput.example;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Test {

	public static void main(String[] args) throws IOException
	{
	 
		FileInputStream finput1 = new FileInputStream("abc.txt");
		FileInputStream finput2 = new FileInputStream("abc1.txt");
		SequenceInputStream sis = new SequenceInputStream(finput1, finput2);
		FileOutputStream foutput = new FileOutputStream("abc2.txt");
		int m =0;
		while((m=sis.read())!=-1)
		{
	     		System.out.print(m);
	     		foutput.write((char)m);
		}
		foutput.close();
		sis.close();
		finput1.close();
		finput2.close();
		System.out.println("");
	}

}
