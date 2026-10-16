// IT24103251 - Lab 9 Question 2
// Method to calculate the area of a circle

import java.util.Scanner;

public class IT24103251Lab9Q2
{
    // takes radius, calculates area and returns it
    public static double circleArea(double radius)
    {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        double r = input.nextDouble();

        double area = circleArea(r);

        System.out.println("Area of the circle = " + area);
    }
}