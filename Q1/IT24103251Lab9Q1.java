// IT24103251 - Lab 9 Question 1
// Program to solve the quadratic equation ax^2 + bx + c = 0

import java.util.Scanner;

public class IT24103251Lab9Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value for a : ");
        double a = input.nextDouble();

        System.out.print("Enter value for b : ");
        double b = input.nextDouble();

        System.out.print("Enter value for c : ");
        double c = input.nextDouble();

        // x = (-b +/- sqrt(b^2 - 4ac)) / 2a
        double d = Math.pow(b, 2) - (4 * a * c);   // discriminant

        if (d > 0)
        {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (d == 0)
        {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else
        {
            System.out.println("No real roots");
        }
    }
}