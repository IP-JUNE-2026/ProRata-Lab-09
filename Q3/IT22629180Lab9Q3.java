public class IT22629180Lab9Q3 {
    public static void main(String[] args) {
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        int result2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.printf("%-33s: %d%n", "Result of (3 * 4 + 5 * 7)^2", result1);
        System.out.printf("%-33s: %d%n", "Result of (4 + 7)^2 + (8 + 3)^2", result2);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int square(int a) {
        return a * a;
    }
}
