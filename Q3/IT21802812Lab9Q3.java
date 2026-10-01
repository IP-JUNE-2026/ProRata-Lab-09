public class IT21802812Lab9Q3 {

    // Adds two integers and returns the result
    public static int add(int x, int y) {
        return x + y;
    }

    // Multiplies two integers and returns the result
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Multiplies a number by itself and returns the result
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // i. (3 * 4 + 5 * 7)^2
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));

        // ii. (4 + 7)^2 + (8 + 3)^2
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)\u00B2      : " + result1);
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2   : " + result2);
    }
}