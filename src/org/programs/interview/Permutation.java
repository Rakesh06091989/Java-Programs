package org.programs.interview;

import java.io.*;
import java.util.Scanner;

public class Permutation {
 
    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r)
    {
        // Current combination is ready to be printed, print it
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println("");
            return;
        }
 
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r);
        }
    }
 
    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r)
    {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
 
        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
 
    /*Driver function to check for above function*/
    public static void main (String[] args) {
    	Scanner in1 = new Scanner(System.in);
    	System.out.println("Enter the value of N and K");
    	int r = in1.nextInt();
    	int K = in1.nextInt();
    	int totalCards = K*10;
    	int m=0;
    	int arr[] = new int[totalCards];
    	for(int i=0;i<10;i++)
    	{
    		for(int j=0;j<K;j++)
    		{
    			arr[m]=i;
    			m++;
    		}
    	}
        int n = arr.length;
        for(int p=0;p<n;p++)
        {
        	System.out.print(arr[p]);
        }
       printCombination(arr, n, r);
    }
}