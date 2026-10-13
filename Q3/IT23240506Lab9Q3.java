public class IT23240506Lab9Q3 {

    // add two numbers
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    // multiply two numbers
    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    // square a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // expression i: (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int ans1 = square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2\t: " + ans1);

        // expression ii: (4 + 7)^2 + (8 + 3)^2
        int part1 = square(add(4, 7));
        int part2 = square(add(8, 3));
        int ans2 = add(part1, part2);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2\t: " + ans2);
    }
}