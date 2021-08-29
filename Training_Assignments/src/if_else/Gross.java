package if_else;
import java.util.*;
public class Gross {

	public static void main( String[] args ) 
    {
        double Basic_Salary, DA, HRA, Gross_Salary;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Basic Salary : ");
        Basic_Salary = scan.nextDouble();
        
        if(Basic_Salary <=10000)
        {
	        DA = (Basic_Salary * 80) / 100;
	        HRA = (Basic_Salary * 20) / 100;
	        Gross_Salary = Basic_Salary + DA + HRA;
        
	        System.out.println("\nDearness Allowance 80 % of Basic Salary : " + DA);
	        System.out.println("House Rent 20 % of Basic Salary : " + HRA);
	        System.out.println("Gross Salary : " + Gross_Salary);
        }
        
        else if(Basic_Salary <=20000)
        {
        	DA = (Basic_Salary * 90) / 100;
	        HRA = (Basic_Salary * 25) / 100;
	        Gross_Salary = Basic_Salary + DA + HRA;
        
	        System.out.println("\nDearness Allowance 90 % of Basic Salary : " + DA);
	        System.out.println("House Rent 25 % of Basic Salary : " + HRA);
	        System.out.println("Gross Salary : " + Gross_Salary);
        }
        
        
         if(Basic_Salary > 20000)
        {
        	DA = (Basic_Salary * 95) / 100;
	        HRA = (Basic_Salary * 30) / 100;
	        Gross_Salary = Basic_Salary + DA + HRA;
        
	        System.out.println("\nDearness Allowance 95 % of Basic Salary : " + DA);
	        System.out.println("House Rent 30 % of Basic Salary : " + HRA);
	        System.out.println("Gross Salary : " + Gross_Salary);
        }
    }
}
