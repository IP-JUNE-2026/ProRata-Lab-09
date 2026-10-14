import java.util.*;
public class public class IT22087942Lab7Q1A {
Lab9Q2{
	
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the radius of the circle: ");
	double radius = sc.nextDouble();
	
	double area = circleArea(radius);
	
	System.out.println("The area of the circle with radius "+radius+" is: "+ area );
	
}
public static double circleArea(double radius){
	return 22*radius*radius/7;
}
}


	
