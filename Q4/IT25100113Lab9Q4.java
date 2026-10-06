import java.util.Scanner;
public class IT25100113Lab9Q4 {

	public static double calcFinalMark(double aMark, double eMark){
		return aMark*0.3+eMark*0.7;
	}
	public static char findGrades(double fMark) {
		if (fMark>=75) return 'A';
		else if (fMark>=60 && fMark<=75) return 'B';
		else if (fMark>=50 && fMark<=60) return 'c';
		else return 'F';
	}
	public static void printDetails(String name, double fMark, char grade){
		System.out.printf("%-10s %-12.2f %-6c%n", name, fMark, grade);
	}
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	int studentArray[] = new  int[8];
	String name[] = new String[5];
	double fMark[] = new double[5];
	char grade[] = new char[5];
	for (int i=0; i<5; i++) {
		System.out.print("Enter Name of Student " + (i+1) + ":");
		name[i] = input.next();
		System.out.print("Enter Assignment Mark (out of 100) for " + name[i] + ":");
		double aMark = input.nextDouble();
		System.out.print("Enter Exam Paper Mark (out of 100) for " + name[i] + ":");
		double eMark = input.nextDouble();
		fMark[i] = calcFinalMark(aMark,eMark);
		grade[i] = findGrades(fMark[i]);
		System.out.println();
	}
	System.out.printf("%-10s %-12s %-6s%n", "Name", "Final Mark", "Grade");
	for (int i=0; i<5; i++) {
	printDetails(name[i], fMark[i], grade[i]);
	}
	}
}
