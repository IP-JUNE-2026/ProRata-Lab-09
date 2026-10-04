import java.util.Scanner;

public class IT21127328Lab9Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            finalMarks[i] = calculateFinalMark(assignmentMark, examMark);
            grades[i] = findGrade(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-12s%-16s%-8s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }

    public static double calculateFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrade(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-12s%-16.2f%-8c\n", name, finalMark, grade);
    }
}