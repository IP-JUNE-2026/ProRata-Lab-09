import java.util.Scanner;

public class IT24101871Lab9Q2
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the radius of the circle : ");
        double r = input.nextDouble();
         
        double area = calculateArea(r);
        
        System.out.print("The area of the circle with radius " +r +" is : " +area);
    }
    
    //Method to calculate the area of the circle
    public static double calculateArea(double area)
    {
        return Math.pow(area,2) * 22/7;
    }
}