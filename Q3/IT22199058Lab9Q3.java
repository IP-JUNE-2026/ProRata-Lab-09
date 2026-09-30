public class IT22199058Lab9Q3 {
    public static void main(String[] args) {
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        int result2 = square(add(4, 7)) + square(add(8, 3));

        System.out.println("Result of (3 * 4 + 5 * 7)\u00B2        : " + result1);
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2    : " + result2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }
}