public class IT25100113Lab9Q3 {

	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static int multiply(int n1, int n2) {
		return n1*n2;
	}
	public static int square(int n) {
		return n*n;
	}
	public static void main (String[] args) {
		int q1 = square(add(multiply(3, 4), multiply(5, 7)));
		int q2 = add(square(add(4,7)),square(add(8,3)));
		System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + q1);
		System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + q2);
	}
}