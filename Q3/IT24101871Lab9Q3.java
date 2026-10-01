public class IT24101871Lab9Q3
{
    public static void main (String [] args)
    {
        double x = square(add(multiply(3,4),multiply(5,7)));
        double y = add(square(add(4,7)),square(add(8,3)));
        
        System.out.println("Result of (3 * 4 + 5 * 7)^2     : " +x);
        System.out.print("Result of (4 + 7)^2 + (8 + 3)^2   : " +y);
    }
    
    //Method to calculate addition
    public static double add(double a , double b)
    {
        return a + b;
    }
    
    //Method to calculate addition
    public static double multiply(double c , double d)
    {
        return c * d;
    }
    
    //Method to calculate squreroot
    public static double square(double e)
    {
        return Math.pow(e,2);
    }
}