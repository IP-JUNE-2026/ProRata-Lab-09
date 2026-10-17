import java.util.Scanner;

public class IT22889942Lab9Q2 {

    // Method: takes radius, returns area
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);   // call the method

        System.out.println("The area of the circle with radius " + radius + " is : " + area);

        input.close();
    }
}