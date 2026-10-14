import java.util.Scanner;
public class IT24102392Lab9Q4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		//Define Variables
		int i,j;
		j=1;
		
		//Define Arrays
		String name[] = new String [5];
		double mark1[] = new double [5];
		double mark2[] = new double [5];
		double b[] = new double [5];
		String c[] = new String [5];
		
		//Getting Inputs
		for (i=0 ; i < 5 ; i++) {
		System.out.print ("Enter Name of student " +j+ " : ");
		name[i] = input.next();
		System.out.print ("Enter Assignment Mark (out of 100) for " +name[i]+ " : ");
		mark1[i] = input.nextDouble();
		System.out.print ("Enter Exam Paper Mark (out of 100) for " +name[i]+ " : ");
		mark2[i] = input.nextDouble();
		System.out.println ("");
		
		b[i] = calcFinalMark(mark1[i] , mark2[i]);
		c[i] = findGrades(b[i]);
		j++;
		}
		
		System.out.println ("Name      Final Mark      Grade");
		
		for (i=0 ; i<5 ; i++) {
			printDetails(name[i],b[i],c[i]);
		}
		
	}
	//calcFinalMark Method
	public static double calcFinalMark(double aMark , double pMark){
		return (aMark*(0.30))+(pMark*(0.70));
	}
	
	//findGrades Method
	public static String findGrades (double fMark) {
		if (fMark >= 75){
			return "A";
		}
		else if (fMark >= 60 && fMark < 75) {
			return "B";
		}
		else if (fMark >= 50 && fMark < 60) {
			return "C";
		}
		else if (fMark < 50) {
			return "F";
		}
		else {
			return "Invalid";
		}
	}
	
	//printDetails Method
	public static void printDetails(String a,double b,String c){
		System.out.println (a+ "       " +b+ "            " +c);
	}
}