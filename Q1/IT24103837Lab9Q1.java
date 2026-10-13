import java.util.Scanner;

public class IT24103837Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Calculate x using the quadratic formula
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (a == 0) {
            System.out.println("Error: a cannot be zero for a quadratic equation.");
        } else if (discriminant < 0) {
            System.out.println("No real x values because the square root is negative.");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        input.close();
    }
}
