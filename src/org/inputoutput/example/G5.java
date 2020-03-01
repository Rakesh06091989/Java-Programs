package org.inputoutput.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class G5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter your Name:");
		String name = br.readLine();
		System.out.println("Welcome "+name);
		String marks ="";
		while(!marks.equals("stop"))
		{ 
			System.out.println("Enter your marks");
			marks = br.readLine();
			System.out.println(marks);
			
		}
		
		

	}

}
