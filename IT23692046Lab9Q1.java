package Lab9;

import java.util.Scanner;

public class IT23692046Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac) using Math.pow()
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant >= 0) {
            // Calculate the two root values for x using Math.sqrt()
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display results
            System.out.println("\nThe values of x are:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("\nThe roots are imaginary (discriminant is negative).");
        }

        scanner.close();
    }
}