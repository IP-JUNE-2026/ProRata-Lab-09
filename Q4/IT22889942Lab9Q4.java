import java.util.Scanner;

public class IT22889942Lab9Q4 {

    // (a) Calculate final mark: 30% assignment + 70% exam
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // (b) Find grade from final mark
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

    // (c) Print one student's details
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s %-10.2f %-5s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int studentCount = 5;
        String[] names = new String[studentCount];
        double[] finalMarks = new double[studentCount];
        String[] grades = new String[studentCount];

        // (d) Read all 5 students' data
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Print table
        System.out.println();
        System.out.printf("%-10s %-10s %-5s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < studentCount; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}