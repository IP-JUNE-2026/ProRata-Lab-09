public class IT22643490_Lab9Q3 {

    public static void main(String[]args) {

        System.out.println(square(add(multiply(3, 4), multiply(5, 7))));

        System.out.println(add(square(add(4, 7)), square(add(8, 3))));

    }

    public static int add(int a, int b) {

        int c = a + b;

        return c;

    }

    public static int multiply(int a, int b) {

        int d = a * b;

        return d;

    }

    public static int square(int a) {

        int e = a * a;

        return e;

    }

}
