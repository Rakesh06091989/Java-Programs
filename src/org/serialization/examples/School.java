package org.serialization.examples;

import java.io.Serializable;

public class School implements Serializable{
	
	String name1;
	int no = 104;
	School()
	{
		System.out.println("this is constructor from school");
	}
	
	/*School(String name,int no)
	{
		this.name=name;
		this.no=no;
	}*/

}
