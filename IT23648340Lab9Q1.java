import java.util.Scanner;

public class  IT23648340Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Calculate discriminant
        double d = Math.pow(b, 2) - (4 * a * c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } 
        else if (d == 0) {
            double x = (-b) / (2 * a);

            System.out.println("x1 = x2 = " + x);
        } 
        else {
            System.out.println("No Real Roots");
        }

        input.close();
    }
}