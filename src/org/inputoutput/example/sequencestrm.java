package org.inputoutput.example;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class sequencestrm {

	public static void main(String[] args) throws IOException
	{
		FileInputStream finput4 = new FileInputStream("abc.txt");
		FileInputStream finput5 = new FileInputStream("abc1.txt");
		FileInputStream finput3 = new FileInputStream("abc2.txt");
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(finput4);
		v.add(finput5);
		v.add(finput3);
		Enumeration<FileInputStream> em = v.elements();
		SequenceInputStream sis1 = new SequenceInputStream(em);
		FileOutputStream fouput2 = new FileOutputStream("abc3.txt");
		int n=0;
		while((n=sis1.read())!=-1)
		{
			System.out.print((char)n);
			fouput2.write((char)n);
		}
		sis1.close();
		fouput2.close();
     }
}
