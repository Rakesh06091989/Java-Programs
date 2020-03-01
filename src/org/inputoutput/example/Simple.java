package org.inputoutput.example;
import java.io.*;

public class Simple {

	private static FileReader fr;
	private static FileWriter fw;

	public static void main(String[] args) throws IOException {
		fw = new FileWriter("abc.txt");
		fr = new FileReader("abc1.txt");
		
		int i = 0;
		while((i=fr.read())!= -1)
		{
			System.out.print((char)i);
			fw.write((char)i);
		}
		
		fw.close();
		fr.close();
		try
		{
		CharArrayWriter arry = new CharArrayWriter(50);
		arry.write("this is character array example");
		FileWriter fw1 = new FileWriter("abc2.txt");
		arry.writeTo(fw1);
		fw1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				

	}

}
