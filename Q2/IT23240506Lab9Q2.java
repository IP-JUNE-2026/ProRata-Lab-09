import java.util.Scanner;

public class IT23240506Lab9Q2 {

    // method to calculate circle area
    public static double circleArea(double radius) {
        double area = (22.0 / 7.0) * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        // calling method
        double result = circleArea(r);
        System.out.printf("Area of Circle: %.2f\n", result);
    }
}