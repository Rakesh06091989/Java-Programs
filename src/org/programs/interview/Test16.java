package org.programs.interview;

import java.util.Scanner;
import java.util.*;

public class Test16 {

 
	public static void main(String[] args) {
	
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 al.add(23);
	 al.add(10);
	 al.add(45);
	 al.add(17);
	 al.add(56);
/*	 Comparator<Integer> com = Collections.reverseOrder();
	 Collections.sort(al,com);*/
	 Collections.sort(al,Collections.reverseOrder());
	 int max = Collections.max(al);
	 System.out.println(al);
	 System.out.println(max);
	}

}
