package org.programs.interview;

public class MyStringToNumber {
	 
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        System.out.println(zeroAscii);
        for(char c:ch){
            int tmpAscii = (int)c;
            System.out.println(tmpAscii);
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }
     
    public static void main(String a[]){
         
    	int num1 = convert_String_To_Number("3256");
    	int num2 = convert_String_To_Number("76289");
    	int num3 = convert_String_To_Number("90087");
        System.out.println("\"3256\" == "+ num1);
        System.out.println("\"76289\" == "+num2);
        System.out.println("\"90087\" == "+num3);
    }
}