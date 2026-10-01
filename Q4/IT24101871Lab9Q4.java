import java.util.Scanner;

public class IT24101871Lab9Q4
{
    
    //Method to calculate Final Mark
    public static double calcFinalMark(double assignMark, double examMark)
    {
        return (assignMark *0.30 ) + (examMark * 0.70);
    }
    
    //Method to find the Final Grade
    public static char findGrade(double fMark)
    {
        
        char grade;
        if(fMark >= 75)
        {   
             return 'A';               
        }
        else if (fMark >= 60)
        {
            return 'B';
        }
        else if (fMark >= 50)
        {
            return 'C';
        }
        else 
        {
            return 'F';
        }
    }
    
    //Method to print details
    public static void printDetails(String name, double finalMark, char grade)
    {
        System.out.print(name +"\t\t" +finalMark +"\t\t" +grade +"\n");
    }
    
    //Main method
    public static void main (String [] args)
    {
        String [] name = new String [5];
        double [] mark = new double [5];
        char [] grade = new char [5];
        
        Scanner input = new Scanner (System.in);
        
        //Loop for Inputs and Calculations
        for (int i=0; i<5; i++)
        {
            //getting student name    
            System.out.print("\nEnter Name of Student " +(i+1) +": ");
            name [i] = input.next();
            
            //getting Assignment mark  
            System.out.print("Enter Assignment Mark (out of 100) for " +name[i] +": ");
            double assignMark = input.nextDouble();
            
            //getting Exam mark  
            System.out.print("Enter Exam Paper Mark (out of 100) for " +name[i] +": ");
            double examMark = input.nextDouble();
            
            //Calculating the final mark with method
            mark [i] = calcFinalMark( assignMark, examMark);
            
            //Finding the Grade using the method
            grade [i]= findGrade(mark[i]);
            
        }
        
        System.out.println("Name\tFinal Mark\tGrade");
        
        //Loop for Outputs
        for (int j=0; j<5; j++)
        {
            printDetails(name[j], mark[j], grade[j]);
        }
        
    }
}