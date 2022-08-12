package primeOrNot;

import java.util.Arrays;

public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	public static void main(String[] args) {
		
		
		
	
	int [] num = {3,2,11,4,6,7};
	int [] num1 ={1,2,8,4,9,7};
	
    //int length=num.length;
    //int length2=num1.length;
	Arrays.sort(num);
	Arrays.sort(num1);
    
    for(int i=0;i<num.length;i++) {
    	
    	for(int j=0;j<num1.length;j++)
    	{
    		
    		if(num[i]==num1[j])
    		{
    			
    			System.out.println(" Intersection number:"+ num[i]);
    		} 
//    		else
//    		{
//    			System.out.println("Nothing to Print");
//    		}
    	}
    }
	
   
}
}
