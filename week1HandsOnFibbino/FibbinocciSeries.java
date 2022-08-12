package week1HandsOnFibbino;

public class FibbinocciSeries {
	
	public void fibbi()
	{
		//Tip: firstNum = 0, secNum = 1, sum = 0
		int firstNum=0;
		int secNum=1;
		int sum =0 ;
		int i=1;
		//int sum=0;
		/*Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		Print first number
		Iterate from 1 to the 11
		Add first and second number assign to sum
		Assign second number to the first number
		Assign sum to the second number
		Print sum*/
		System.out.print(firstNum + " " +secNum+" ");	
		
		for(i=1;i<=11;++i)
		{
			//System.out.print(firstNum + "  " + secNum + "  ");   
			   sum = firstNum + secNum ;
			   System.out.print(" " + sum );  
				firstNum = secNum;
				secNum = sum;
				//System.out.print(firstNum + "  " + secNum + "  ");   
		}
		
		
		
		}
			
		
		
		/*System.out.print(firstNum + "  " + secNum + "  ");
		do {
			 sum = firstNum + secNum ;
			System.out.print(sum + "  ");
			firstNum = secNum;
			secNum = sum;	i++;
		} while ( i <=10);*/
	
	public static void main(String[] args) {
		
		FibbinocciSeries objfibbi = new FibbinocciSeries();
		
		System.out.println("Fibbinocciseries for first 11 Numbers are:");
		objfibbi.fibbi();
	}

	
}
