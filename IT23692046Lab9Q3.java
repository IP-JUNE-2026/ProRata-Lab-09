package Lab9;

public class IT23692046Lab9Q3 {

    // Method to add two integers and return the sum
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers and return the product
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square an integer and return the result
    public static int square(int num) {
        return multiply(num, num); // Using multiply method to calculate square
    }

    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int prod1 = multiply(3, 4);          // 3 * 4 = 12
        int prod2 = multiply(5, 7);          // 5 * 7 = 35
        int sum1 = add(prod1, prod2);        // 12 + 35 = 47
        int result1 = square(sum1);          // (47)^2 = 2209

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);                // 4 + 7 = 11
        int sum3 = add(8, 3);                // 8 + 3 = 11
        int square1 = square(sum2);          // (11)^2 = 121
        int square2 = square(sum3);          // (11)^2 = 121
        int result2 = add(square1, square2); // 121 + 121 = 242

        // Display results
        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}