package primeOrNot;

public class findGivenNumberPrimeOrNot {
//	Hint: Iterate through all numbers from 2 to n-1 (input) and 
//	for every number check if it divides n (input). 
//	If we find any number that divides, print prime.
//	If nothing divides, then print non-prime

	public void isPrime()
	{
		int n=100;
		for(int i=2;i<=n-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "The given number is Even number");
			}
			else
			{
				System.out.println(i + "The given number is Prime number");
			}
		}
	}
public static void main(String[] args) {
	
	
	findGivenNumberPrimeOrNot objprime = new findGivenNumberPrimeOrNot();
	objprime.isPrime();
	
}
}
