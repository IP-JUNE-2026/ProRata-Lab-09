public class IT22156624Lab9Q2 {

    // Method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square an integer
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        // i. Expression: (3 * 4 + 5 * 7)2
        int step1_1 = multiply(3, 4);          // 3 * 4
        int step1_2 = multiply(5, 7);          // 5 * 7
        int step1_3 = add(step1_1, step1_2);   // (3*4) + (5*7)
        int result1 = square(step1_3);         // ((3*4) + (5*7))2

        // ii. Expression: (4 + 7)2 + (8 + 3)2
        int step2_1 = add(4, 7);               // 4 + 7
        int step2_2 = square(step2_1);         // (4 + 7)2
        
        int step2_3 = add(8, 3);               // 8 + 3
        int step2_4 = square(step2_3);         // (8 + 3)2
        
        int result2 = add(step2_2, step2_4);   // (4 + 7)2 + (8 + 3)2

        // Print outputs using standard number 2 instead of the superscript symbol
        System.out.println("Result of (3 * 4 + 5 * 7)2  : " + result1);
        System.out.println("Result of (4 + 7)2 + (8 + 3)2 : " + result2);
    }
}