package Lab9;

import java.util.Scanner;

public class IT23692046Lab9Q2 {
    
    // Method to calculate and return the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the radius value as user input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Call the circleArea() method and store the returned result
        double area = circleArea(radius);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}