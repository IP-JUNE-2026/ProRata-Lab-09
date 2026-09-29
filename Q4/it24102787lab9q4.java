import java.util.Scanner;

public class it24102787lab9q4{
	public static void main(String []args){

	Scanner read =new Scanner (System.in);

	int i;
	double finalmark=0;
	char gradeno='a';
	String name [] =new String [5];
	double marks [] =new double [5];
	char grade [] =new char [5];
	int assignment [] =new int [5];
	int exam [] =new int [5];

	for (i=0; i<name.length; ++i) {

	System.out.print("Enter name of Student "+(i+1)+": ");
	name [i] =read.next();

	System.out.print("Enter Assignment mark (out of 100) for "+name[i]+": ");
	assignment [i] =read.nextInt();

	System.out.print("Enter Exam paper mark (out of 100) for "+name[i]+": ");
	exam [i] =read.nextInt();

	System.out.println();
	}

	for (i=0; i<name.length;) {	
	finalmark =(assignment [i]*0.3) + (exam [i] *0.7);
	marks [i] =finalmark;
	++i;
	}

	for (i=0; i<name.length;) {

	if (marks [i] >= 75) {
	gradeno ='A';
	}

	else if ((60 <= marks [i]) && (marks [i] <75)) {
	gradeno ='B';
	}

	else if ((50 <= marks [i]) && (marks [i] <60)) {
	gradeno ='C';
	}

	else if (marks [i] <50) {
	gradeno ='F';
	}

	grade [i] =gradeno;
	++i;
	}

	System.out.println("Name		Final Marks		Grade");

	for (i=0; i<name.length;) {
	System.out.print(name [i]+ "		"+marks [i]+"			"+grade [i]);
	System.out.print("\n");
	++i;
	}

	}

}
	
	