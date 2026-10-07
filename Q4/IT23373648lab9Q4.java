
import java.util.Scanner;
 
public class IT23373648lab9Q4 {
 
    // a) 30% from assignment mark, 70% from exam paper mark
    public static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.30 + exam * 0.70;
    }
 
    // b) Returns the grade for the given final mark
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
 
    // c) Prints the Name, Final Mark and Grade of a student
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-16s%-16.2f%s%n", name, finalMark, grade);
    }
 
    // d) Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int count = 5;
        String[] names = new String[count];
        double[] finalMarks = new double[count];
 
        for (int i = 0; i < count; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();
 
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = input.nextDouble();
 
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();
 
            finalMarks[i] = calcFinalMark(assignment, exam);
        }
 
        System.out.println();
        System.out.printf("%-16s%-16s%s%n", "Name", "Final Mark", "Grade");
 
        for (int i = 0; i < count; i++) {
            printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
        }
 
        input.close();
    }
}
 

