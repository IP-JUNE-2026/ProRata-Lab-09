import java.util.Scanner;

public class IT23317994Lab9Q4
{
    public static double calcFinalMark(double assignmentMark, double examMark)
    {
        double finalMark = (assignmentMark * 0.30) + (examMark * 0.70);

        return finalMark;
    }

    public static String findGrades(double finalMark)
    {
        /*
         * The exact grade ranges are not visible
         * in the uploaded Lab Sheet text.
         * Therefore this method should be updated
         * according to the grade table given in your sheet.
         */

        if (finalMark >= 75)
        {
            return "Distinction";
        }
        else if (finalMark >= 50)
        {
            return "Credit";
        }
        else
        {
            return "Fail";
        }
    }

    public static void printDetails(String name, double finalMark, String grade)
    {
        System.out.println("Name = " + name);
        System.out.println("Final Mark = " + finalMark);
        System.out.println("Grade = " + grade);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Student " + i);

            System.out.print("Enter Name: ");
            String name = input.next();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double examMark = input.nextDouble();

            double finalMark = calcFinalMark(assignmentMark, examMark);

            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}