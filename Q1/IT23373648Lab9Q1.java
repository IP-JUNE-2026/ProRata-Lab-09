import java. util.Scanner;

public class IT23373648Lab9Q1 {
  public static void main (String [] args){
   Scanner input = new Scanner (System.in);
   
   System .out.print("Enter alue a :");
   double a = input .nextDouble();
   System .out.print("Enter alue b :");
   double b = input .nextDouble();
   System .out.print("Enter alue c :");
   double c = input .nextDouble();
   
   double d = Math.pow(b,2) - 4 * a * c;
   
   System.out.println();
   
   if(d > 0){
   
   double root1 = (-b + Math.sqrt(d)) /(2*a);
   double root2 = (-b + Math.sqrt(d)) /(2*a);
   
  System.out.println("Roots are real and different :");
  System.out.printf("Roots 1: %.2f%n", root1);
  System.out.printf("Roots 1: %.2f%n", root1);
   
   }else if (d == 0){
   double root = -b /(2*a);
   System.out.println("Roots are real  and equal: ");
   System.out.printf("Root 1 = Root2 : %.2f%n", root);
   }else
   {
   System.out.println("Roots are not real(no real roots) . ");
   }
   
   input. close();
  
  }

}