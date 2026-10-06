import java.util.Scanner;

public class IT22643490_Lab9Q2 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter the radious");

        double radious = sc1.nextDouble();

        System.out.println(circleArea(radious));

    }

    public static double circleArea(double r) {

        double area = Math.PI * r * r;

        return area;

    }

}
