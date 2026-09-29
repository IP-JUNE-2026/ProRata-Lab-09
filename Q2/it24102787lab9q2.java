import java.util.Scanner;

public class it24102787lab9q2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double radius, area ;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();

        area = circleArea(radius);
        System.out.println();
        System.out.println("The area of the circle with radius "+radius+" is : "+area);

    }


    public static double circleArea(double radius){

        double area;

        area = (Math.PI)*radius*radius;
        return area;

    }

}