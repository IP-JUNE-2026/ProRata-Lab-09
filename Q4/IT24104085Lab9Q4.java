import java.util.Scanner;

public class IT24104085Lab9Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        System.out.println();
         // 5 students input
          for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = scanner.nextDouble();
            System.out.print("Enter Exam paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
         System.out.println();
        }

        // Calculate final marks and grades
       System.out.println();
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrades(finalMarks[i]);
        }
        System.out.println();
        // Print students details
        printDetails(names, finalMarks, grades);

        scanner.close();
    }

    // calculate the final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    //find the grade and final mark
    public static String findGrades(double finalMark) {
        if (finalMark >= 75 && < 100) {
            return "A";
        } else if (finalMark >= 60 && finalMark < 75) {
            return "B";
        } else if (finalMark >= 50 && finalMark < 60) {
            return "C";
        } else if (finalMark <50) {
            return "D";
        } else {
            return "F";
        }
    }

    // print the table
    public static void printDetails(String[] names, double[] finalMarks, String[] grades) {
        System.out.printf("%-15s %-15s %-15s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s %-15.2f %-15s%n", names[i], finalMarks[i], grades[i]);
        }
    }
}
