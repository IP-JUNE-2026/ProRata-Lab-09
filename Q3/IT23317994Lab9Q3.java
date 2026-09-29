public class IT23317994Lab9Q3
{
    public static int add(int number1, int number2)
    {
        return number1 + number2;
    }

    public static int multiply(int number1, int number2)
    {
        return number1 * number2;
    }

    public static int square(int number)
    {
        return number * number;
    }

    public static void main(String[] args)
    {
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of expression 1 = " + result1);
        System.out.println("Result of expression 2 = " + result2);
    }
}