package loops;
import java.util.*;
public class SumoneToNEven {

	
			public static void main(String[] args) 
			{
				int number, i, evenSum = 0;
				Scanner sc=new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					if(i % 2 == 0)
					{
						evenSum = evenSum + i; 
						System.out.print(i+"\t");
					}
				}
				System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
			}
	}


