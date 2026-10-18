import java.util.Scanner;

public class  IT23648340Lab9Q4 {

  
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    
    public static String findGrades(double finalMark) {

        if (finalMark >= 80) {
            return "A";
        } else if (finalMark >= 70) {
            return "B";
        } else if (finalMark >= 60) {
            return "C";
        } else {
            return "F";
        }
    }

    
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s %-12.2f %-5s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("\nEnter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double examMark = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\n-------------------------------------");
        System.out.printf("%-10s %-12s %-5s\n",
                "Name", "Final Mark", "Grade");
        System.out.println("-------------------------------------");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}