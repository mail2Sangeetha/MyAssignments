package primeOrNot;

public class Calculator {
//	--  Create a class "Calculator" with below methods
//	(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
//	(b) sub(int num1, int num2), it should return subtraction of of num1-num2
//	(c) mul(double num1, double num2), it should return product of num1 * num2
//	(d) divide(float num1, float num2), it should return division of num1 / num2
//
//-- Create another class as MyCalculator and call all the methods from Calculator and print the results

public int add(int num1,int num2,int num3)
{
	//System.out.println("Addition of 3 numbers is :");
	return num1+num2+num3;
	
}
public int sub(int num1,int num2)
{
	
	return num1-num2;
		
}

public double mul(double num1, double num2)
{
	
	return num1*num2;
		
}
public float divide(float num1, float num2)
{
	
	return num1/num2;
		
}

public static void main(String[] args) {
	
	Calculator objcal = new Calculator();
	//objcal.add(4, 6, 5);
	System.out.println("Addition of 3 numbers is :" +	objcal.add(4, 6, 5) );
	//objcal.sub(28, 9);
	System.out.println("Sub of 2 numbers is :" + objcal.sub(28, 9));
	//objcal.mul(33, 77);
	System.out.println("Mul of 2 numbers is :" + objcal.mul(33, 77) );
	//objcal.divide(59, 5);
	System.out.println("Div of 2 numbers is :" +objcal.divide(59, 5));
}


}
