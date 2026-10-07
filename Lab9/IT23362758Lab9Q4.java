import java.util.Scanner;

public class IT23362758Lab9Q4
{
    public static double calcFinalMark(double assignment,
                                       double exam)
    {
        return (assignment * 0.30) +
               (exam * 0.70);
    }

    public static char findGrades(double finalMark)
    {
        if(finalMark >= 75)
            return 'A';
        else if(finalMark >= 60)
            return 'B';
        else if(finalMark >= 50)
            return 'C';
        else
            return 'F';
    }

    public static void printDetails(String name,
                                    double finalMark,
                                    char grade)
    {
        System.out.printf("%-10s %-10.2f %-5c\n",
                          name,
                          finalMark,
                          grade);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.print("\nEnter Name of Student: ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark: ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double exam = input.nextDouble();

            finalMarks[i] =
            calcFinalMark(assignment, exam);

            grades[i] =
            findGrades(finalMarks[i]);
        }

        System.out.println("\n--------------------------------");
        System.out.println("Name       Final Mark Grade");
        System.out.println("--------------------------------");

        for(int i = 0; i < 5; i++)
        {
            printDetails(
                names[i],
                finalMarks[i],
                grades[i]
            );
        }
    }
}