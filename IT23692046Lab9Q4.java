package Lab9;

import java.util.Scanner;

public class IT23692046Lab9Q4 {

    // a) Method to calculate the final mark (30% assignment, 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to return the grade based on the final mark
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to process 5 students
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Student " + i + " ---");
            
            System.out.print("Enter assignment mark: ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter exam paper mark: ");
            double examMark = scanner.nextDouble();

            // Calculate final mark using calcFinalMark()
            double finalMark = calcFinalMark(assignmentMark, examMark);

            // Find grade using findGrades()
            char grade = findGrades(finalMark);

            // Display results for the student
            System.out.println("Final Mark: " + finalMark);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
package Lab9;

import java.util.Scanner;

public class IT23692046Lab9Q4 {

    // a) Method to calculate the final mark (30% assignment, 70% exam)
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Method to return the grade based on the final mark
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

    // c) Method to print the Name, Final Mark, and Grade of a student in a tabular format
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-12.2f %-6c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store details of 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        // d) In Main Method, ask the user to enter Name, Assignment Mark, and Exam Paper Mark for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            
            System.out.print("Enter Name: ");
            scanner.nextLine(); // Consume newline left-over
            names[i] = scanner.nextLine();

            System.out.print("Enter Assignment Mark (out of 100): ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100): ");
            double examMark = scanner.nextDouble();

            // Calculate final mark and grade
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        // Display the table header matching the expected output format
        System.out.println("\n----------------------------------------");
        System.out.printf("%-15s %-12s %-6s%n", "Name", "Final Mark", "Grade");
        System.out.println("----------------------------------------");

        // Print details for each student using the printDetails() method
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        System.out.println("----------------------------------------");

        scanner.close();
    }
}