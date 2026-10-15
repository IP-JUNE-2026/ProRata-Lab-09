import java.util.Scanner;

public class IT22921130Lab9Q4 {

    // Calculate Final Mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // Find Grade
    public static String findGrades(double finalMark) {

        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 65)
            return "B";
        else if (finalMark >= 55)
            return "C";
        else if (finalMark >= 35)
            return "S";
        else
            return "F";
    }

    // Print Details
    public static void printDetails(String name,
                                    double finalMark,
                                    String grade) {

        System.out.println("\nStudent Name : " + name);
        System.out.println("Final Mark   : " + finalMark);
        System.out.println("Grade        : " + grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.next();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            double examMark = input.nextDouble();

            double finalMark =
                    calcFinalMark(assignmentMark, examMark);

            String grade =
                    findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}