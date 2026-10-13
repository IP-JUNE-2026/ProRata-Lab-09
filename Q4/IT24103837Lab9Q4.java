import java.util.Scanner;

public class IT24103837Lab9Q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static String findGrades(double finalMark) {
        // Common grading bands; update these boundaries if your lab sheet specifies others.
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 65) {
            return "B";
        } else if (finalMark >= 55) {
            return "C";
        } else if (finalMark >= 35) {
            return "S";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("Name: %s | Final Mark: %.2f | Grade: %s%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter assignment mark (out of 100): ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter exam paper mark (out of 100): ");
            double examMark = input.nextDouble();
            input.nextLine(); // Consume the newline before the next student's name

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);
            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}
