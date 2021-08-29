package loops;

import java.util.Scanner;
public class SumOddOneToN {

	
			public static void main(String[] args) 
			{
				int number, i, oddSum = 0;
				Scanner sc=new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					if(i % 2 == 1)
					{
						oddSum = oddSum + i;
						System.out.print(i+"\t");
					}
					
				}
				
				System.out.println("\n The Sum of odd Numbers upto " + number + "  =  " + oddSum);
			}
	}



