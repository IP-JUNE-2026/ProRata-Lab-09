import java.util.Scanner;

public class IT24104085Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // Input values for a, b, and c
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Calculate the roots
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

         System.out.println();
         System.out.println("Roots are real and different : ");

            System.out.printf("Root 1: %.2f%n", + root1);
            System.out.printf("Root 2: %.2f%n", + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", + root);
        } else {
            System.out.println("The equation has no real roots.");
        }

        scanner.close();
    }
}