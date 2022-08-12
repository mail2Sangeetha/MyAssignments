package primeOrNot;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		
		// Here is the input
		// Sort the array	
		

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
		      
		
		int[] arr = {1,2,3,4,7,6,8};
		int length = arr.length;
		Arrays.sort(arr);
		int i ;		
	
       for(i =arr[0]; i<=length-1;i++)
		{
			if(i!= arr[i-1])
			{
				System.out.println("missing element is " +i);
				break;
			}

		}
	}
				
	
}
