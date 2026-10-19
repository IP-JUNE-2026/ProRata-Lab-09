public class IT24103207Lab9Q3 {
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
        // i. (3 * 4 + 5 * 7)^2
        int r1 = square(add(multiply(3, 4), multiply(5, 7)));
        // ii. (4 + 7)^2 + (8 + 3)^2
        int r2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("(3 * 4 + 5 * 7)^2 = " + r1);
        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + r2);
    }
}
