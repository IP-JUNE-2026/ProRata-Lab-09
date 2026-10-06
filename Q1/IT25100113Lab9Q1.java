import java.util.Scanner;

public class IT25100113Lab9Q1 {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter value a: ");
	double a = input.nextDouble();
	System.out.print("Enter value b: ");
	double b = input.nextDouble();
	System.out.print("Enter value c: ");
	double c = input.nextDouble();
	System.out.println();
	double d = (Math.pow(b,2)) - (4*a*c);
	if ( d>0 ) {
		double r1 = (-b + Math.sqrt(d))/(2*a);
		double r2 = (-b - Math.sqrt(d))/(2*a);
		System.out.println("Roots are real and different :");
		System.out.println("Root 1: " + r1);
		System.out.print("Root 2: " + r2);
	} else if ( d==0 ) {
		double x = -b/(2*a);
		System.out.print("Real root is: " + x);
	} else {
		System.out.print("No real roots!");
	}
	}
}