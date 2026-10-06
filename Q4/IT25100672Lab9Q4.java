import java.util.Scanner;

public class IT25100672Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double mark) {
        if (mark >= 75) return 'A';
        else if (mark >= 60) return 'B';
        else if (mark >= 50) return 'C';
        else return 'F';
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%s\t | %.2f\t | %c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();
            
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }
        
        System.out.println("\nName\t | Final Mark\t | Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        
        input.close();
    }
}