import java.util.Scanner;

public class IT23240506Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read inputs a, b, c
        System.out.print("Enter value a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value c: ");
        double c = sc.nextDouble();

        // calculate discriminant (b^2 - 4ac)
        double disc = Math.pow(b, 2) - (4 * a * c);

        if (disc > 0) {
            System.out.println("\nRoots are real and different :");
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);

            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            System.out.println("\nRoots are not real.");
        }
    }
}