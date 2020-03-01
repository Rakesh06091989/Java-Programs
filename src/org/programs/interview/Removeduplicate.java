package org.programs.interview;

import java.util.*;

public class Removeduplicate {

	public static void main(String[] args) {
	
		Integer num[] = {23,67,34,23,78,55,99,45,34};
/*		List<Integer> ls = new ArrayList<Integer>();
		ls = Arrays.asList(num);
		Collections.sort(ls);*/
		HashSet<Integer> hs = new HashSet<Integer>();
		Collections.addAll(hs, num);
		/*for (Integer number : ls) {
		hs.add(number);
		}*/
		//ls.addAll();
		Object[] fina = hs.toArray();
		for(int i = 0;i<fina.length;i++)
		{
			System.out.println(fina[i]);
		}
		
		 
			
	}
}
