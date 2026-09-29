public class it24102787lab9q3{
	public static void main(String []args){

	double result1,result2;

	result1 =square(multiply(3, 4) + multiply(5,7));
	System.out.println("Result of (3*4+5*7)^2		:"+result1);

	result2 =add(square(4+7),square(8+3));
	System.out.println("Result of (4+7)^2+(8+3)^2	:"+result2);
	}

	public static double add(double num1,double num2)
	{
	return num1+num2;
	}

	public static double multiply(double num1,double num2)
	{
	return num1*num2;
	}

	public static double square(double num1)
	{
	return num1*num1;
	}
	
}