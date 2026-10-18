public class  IT23648340Lab9Q3 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        // i. (3 * 4 + 5 * 7)^2
        int expression1 = square(
                                add(
                                    multiply(3, 4),
                                    multiply(5, 7)
                                   )
                                );

        // ii. (4 + 7)^2 + (8 + 3)^2
        int expression2 = add(
                                square(add(4, 7)),
                                square(add(8, 3))
                             );

        System.out.println("Result of Expression 1 = " + expression1);
        System.out.println("Result of Expression 2 = " + expression2);
    }
}