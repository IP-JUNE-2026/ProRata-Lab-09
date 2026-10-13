import java.util.Scanner;

public class IT23240506Lab9Q4 {

    // calculate final mark (30% assignment + 70% exam)
    public static double calcFinalMark(double assignMark, double examMark) {
        return (assignMark * 0.30) + (examMark * 0.70);
    }

    // find grade based on mark
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

    // print student details
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-15s %-12.2f %-5s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        // get details for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assign = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();

            System.out.println();

            // calculate final mark and grade
            finalMarks[i] = calcFinalMark(assign, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        // display table output
        System.out.println("\nName            Final Mark   Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}