package Question3;

public class IT23210110Lab9Q3 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // Expression i: (3*4 + 5*7)^2
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);
        int result1 = square(sum1);

        // Expression ii: (4+7)^2 + (8+3)^2
        int sum2 = add(4, 7);
        int sq1 = square(sum2);
        int sum3 = add(8, 3);
        int sq2 = square(sum3);
        int result2 = add(sq1, sq2);

        System.out.println("Result of (3*4+5*7)^2     : " + result1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + result2);
    }
}
