import java.util.Scanner;
public class IT24102392Lab9Q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        System.out.print("Enter value c: ");
        double c = input.nextDouble();
        double discriminant;
        discriminant=Math.pow(b,2)-(4*a*c);
        double root1,root2;
        if(discriminant>0){
            System.out.println("Roots are real and different : ");
            root1=(-b+Math.sqrt(discriminant))/(2*a);
            root2=(-b-Math.sqrt(discriminant))/(2*a);
            
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else if (discriminant==0) {
            System.out.println("Roots are real and same");
            root1=(-b+Math.sqrt(discriminant))/(2*a);
            root2=(-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else{
            System.out.println("Roots are imaginary");
            root1=(-b+Math.sqrt(discriminant))/(2*a);
            root2=(-b-Math.sqrt(discriminant))/(2*a);
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }


    }
}