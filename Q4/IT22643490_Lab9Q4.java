import java.util.Scanner;

public class IT22643490_Lab9Q4 {

    public static void main(String[]args) {

        Scanner sc1 = new Scanner(System.in);

        String[]names = new String[5];
        double[]finalmark = new double[5];

        int i = 0;

        while (i < 5) {
            System.out.println("Enter the name of the student");
            String name = sc1.next();

            names[i] = name;

            System.out.println("Enter the Assignmwnt mark");

            int assignmark = sc1.nextInt();

            System.out.println("Enter the Exam paper mark");

            int papermark = sc1.nextInt();

            finalmark[i] = calcFinalMark(assignmark, papermark);

            i++;

        }

        findGrades(finalmark, names);

    }

    public static double calcFinalMark(int a, int b) {

        double finalmark = ((a * 30) + (b * 70)) / 100.0;
        return finalmark;

    }

    public static void findGrades(double[]arr, String[]ss) {

        int i = 0;

        while (i < 5) {

            if (arr[i] >= 75) {
                System.out.print("A  ");

            } else if (arr[i] < 75 && arr[i] >= 60) {
                System.out.print("B  ");

            } else if (arr[i] < 60 && arr[i] >= 50) {
                System.out.print("C  ");

            } else {
                System.out.print("F ");

            }

            System.out.print(" " + ss[i]);
            System.out.println(" " + arr[i]);

            i++;

        }

    }

}
