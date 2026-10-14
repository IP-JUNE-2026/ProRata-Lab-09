import java.util.Scanner;

public class IT22206350Lab9Q4 {

    // a) 30% from the assignment mark and 70% from the exam paper mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        double finalMark = (assignmentMark * 0.30) + (examMark * 0.70);
        return finalMark;
    }

    // b) Returns the grade for the given final mark
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

    // c) Prints the Name, Final Mark and Grade of a student
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-19s%-19.2f%s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_STUDENTS = 5;

        String[] names = new String[NUMBER_OF_STUDENTS];
        double[] finalMarks = new double[NUMBER_OF_STUDENTS];
        String[] grades = new String[NUMBER_OF_STUDENTS];

        // d) Read the details of 5 students
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {

            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();
            input.nextLine(); // clear the rest of the line before reading the next name

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Display the Name, Final Mark and Grade of each student
        System.out.println();
        System.out.printf("%-19s%-19s%s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}
