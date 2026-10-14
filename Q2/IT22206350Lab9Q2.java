import java.util.Scanner;

public class IT22206350Lab9Q2 {

    // Calculates and returns the area of a circle
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.println("The area of the circle with radius " + radius + " is : " + area);
    }
}
