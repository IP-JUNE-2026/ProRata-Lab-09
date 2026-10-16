// IT24103251 - Lab 9 Question 4
// Final mark and grade calculation for 5 students

import java.util.Scanner;

public class IT24103251Lab9Q4
{
    // a) final mark = 30% assignment + 70% exam
    public static double calcFinalMark(double assignmentMark, double examMark)
    {
        double finalMark = (assignmentMark * 0.3) + (examMark * 0.7);
        return finalMark;
    }

    // b) find the grade for a given final mark
    public static String findGrades(double finalMark)
    {
        String grade;

        if (finalMark >= 75)
            grade = "A";
        else if (finalMark >= 65)
            grade = "B";
        else if (finalMark >= 55)
            grade = "C";
        else if (finalMark >= 50)
            grade = "D";
        else
            grade = "F";

        return grade;
    }

    // c) print the details of a student
    public static void printDetails(String name, double finalMark, String grade)
    {
        System.out.println("Name       : " + name);
        System.out.println("Final Mark : " + finalMark);
        System.out.println("Grade      : " + grade);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println("---- Student " + i + " ----");

            System.out.print("Enter name : ");
            String name = input.next();

            System.out.print("Enter assignment mark : ");
            double aMark = input.nextDouble();

            System.out.print("Enter exam mark : ");
            double eMark = input.nextDouble();

            double fMark = calcFinalMark(aMark, eMark);
            String grade = findGrades(fMark);

            printDetails(name, fMark, grade);
            System.out.println();
        }
    }
}