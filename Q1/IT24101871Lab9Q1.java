import java.util.Scanner;

public class IT24101871Lab9Q1
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);	
		
		//creating a character array to show letters when taking inputs
		char [] letters = {'a', 'b', 'c'};
		int [] num = new int [3];
		
		double root1, root2;
		
		//taking user inputs
		for (int i = 0; i<3; i++)
		{
			System.out.print("Enter value " +letters[i] +": ");
			num [i] = input.nextInt();
		}
		
		int a = num[0], b = num[1], c = num[2];
		    
		double d = Math.pow(b,2) - 4*a*c;
		
		root1 = (-b + Math.sqrt(d))/(2*a);
		root2 = (-b - Math.sqrt(d))/(2*a);
		
		
		System.out.println("Root are real and different : ");
		System.out.println("Root 1: " +root1);
		System.out.println("Root 2: " +root2);
	
	}
}