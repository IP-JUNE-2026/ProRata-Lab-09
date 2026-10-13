import java.util.Scanner;

public class IT24103837Lab9Q2 {
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);
        System.out.println("Area of circle: " + area);

        input.close();
    }
}
