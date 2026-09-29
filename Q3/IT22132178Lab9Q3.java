public class IT22132178Lab9Q3 {
    public static int add(int first, int second) {
        return first + second;
    }

    public static int multiply(int first, int second) {
        return first * second;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int first = square(add(multiply(3, 4), multiply(5, 7)));
        int second = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result of (3 * 4 + 5 * 7)^2: " + first);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2: " + second);
    }
}
