import java.util.Scanner;

public class IT22132178Lab9Q4 {
    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-20s %-12.2f %c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();
            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignment = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double exam = input.nextDouble();
            input.nextLine();
            finalMarks[i] = calcFinalMark(assignment, exam);
            System.out.println();
        }
        System.out.printf("%-20s %-12s %s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < names.length; i++) {
            char grade = findGrades(finalMarks[i]);
            printDetails(names[i], finalMarks[i], grade);
        }
    }
}
