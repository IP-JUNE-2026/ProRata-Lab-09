import java.util.Scanner;

public class IT24103255Lab9Q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (0.3 * assignmentMark) + (0.7 * examMark);
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
        System.out.printf("%-10s %-10.2f %-10s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            studentNames[i] = scanner.nextLine();
            System.out.print("Assignment Mark (out of 100): ");
            assignmentMarks[i] = scanner.nextDouble();
            System.out.print("Exam Mark (out of 100): ");
            examMarks[i] = scanner.nextDouble();
            scanner.nextLine();  // Clear the newline
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\nName       Final Mark Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(studentNames[i], finalMarks[i], grades[i]);
        }

     }
}
