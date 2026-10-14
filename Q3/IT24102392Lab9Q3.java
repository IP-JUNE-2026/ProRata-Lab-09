public class IT24102392Lab9Q3 {
    public static int add(int x,int y){
        return x+y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static int square(int x){
        return x*x;

    }
    
    public static void main(String[] args) {
        int totalmul,mul1,mul2,totals;
        mul1 = multiply(3,4);
        mul2 = multiply(5,7);
        totalmul=square(add(mul1, mul2));

        int add1,add2,totals2;
        add1 = square(add(4,7));
        add2 = square(add(8, 3));
        totals2 = add(add1, add2);
        
        System.out.println("Result of (3 * 4 + 5 * 7)^2     : "+totalmul);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2     : "+totals2);

        

    }
}
