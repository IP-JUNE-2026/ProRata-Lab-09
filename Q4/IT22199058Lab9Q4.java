import java.util.Scanner;

public class IT22199058Lab9Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            String name = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + name + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + name + ": ");
            double examMark = input.nextDouble();

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);

            names[i] = name;
            finalMarks[i] = finalMark;
            grades[i] = grade;

            System.out.println();
        }

        System.out.printf("%-20s%-15s%s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-20s%-15.2f%s%n", name, finalMark, grade);
    }
}