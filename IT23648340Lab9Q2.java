import java.util.Scanner;

public class  IT23648340Lab9Q2 {

    // Method to calculate area of a circle
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Call method and display result
        double area = circleArea(radius);

        System.out.println("Area of the Circle = " + area);

        input.close();
    }
}