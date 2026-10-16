// IT24103251 - Lab 9 Question 3
// Using add(), multiply() and square() methods

public class IT24103251Lab9Q3
{
    // add two integers and return the result
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }

    // multiply two integers and return the result
    public static int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    // multiply the number by itself and return it
    public static int square(int num)
    {
        return multiply(num, num);
    }

    public static void main(String[] args)
    {
        // i. (3 * 4 + 5 * 7)^2
        int answer1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("(3 * 4 + 5 * 7)^2 = " + answer1);

        // ii. (4 + 7)^2 + (8 + 3)^2
        int answer2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + answer2);
    }
}