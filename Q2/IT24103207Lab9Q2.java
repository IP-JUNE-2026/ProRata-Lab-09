import java.util.Scanner;

public class IT24103207Lab9Q2 {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle: " + circleArea(radius));
    }
}
