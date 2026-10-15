import java.util.Scanner;

public class IT22921130Lab9Q2 {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);

        System.out.println("Area of Circle = " + area);
    }
}