import java.util.Scanner;

public class IT22643490_Lab9Q1 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter value a");

        double a = sc1.nextDouble();

        System.out.println("Enter value b");

        double b = sc1.nextDouble();

        System.out.println("Enter value c");

        double c = sc1.nextDouble();

        double num1 = Math.pow(b, 2) - (4 * a * c);

        if (num1 > 0) {
            double result1 = (-b + (Math.sqrt(num1))) / (2 * a);
            double result2 = (-b - (Math.sqrt(num1))) / (2 * a);

            System.out.println("The result 1 " + result1);
            System.out.println("The result 2 " + result2);

        } else if (num1 == 0) {

            double result3 = -b / (2 * a);
            System.out.println("The result 3 " + result3);

        } else {

            System.out.println("There are is no result for this one");

        }

    }

}
