
import java.util.Scanner;

public class IT25100726Lab9Q4 {

    public static double calcFinalMark(
            double assignmentMark, double examMark) {

        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(
            String name, double finalMark, String grade) {

        System.out.printf("%-20s %-15.2f %-5s%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double examMark = input.nextDouble();

            input.nextLine();

            double finalMark =
                    calcFinalMark(assignmentMark, examMark);

            String grade = findGrades(finalMark);

            if (i == 1) {
                System.out.printf("%-20s %-15s %-5s%n",
                        "Name", "Final Mark", "Grade");
            }

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}
