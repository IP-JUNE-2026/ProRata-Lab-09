import java.util.Scanner;

public class it24102787lab9q1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        System.out.print("Enter value c: ");
        double c = input.nextDouble();

       double root1 = ((-1*b) + Math.sqrt((Math.pow(b,2) - (4*a*c))))/(2*a);
       double root2 = ((-1*b) + Math.sqrt((Math.pow(b,2) - (4*a*c))))/(2*a);

       System.out.println();
       System.out.println("Root are rea; and differet :");
       System.out.println("root1:" +root1);
       System.out.println("root2:" + root2);



    }
}
