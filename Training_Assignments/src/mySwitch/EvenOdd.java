package mySwitch;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter the number::");
		Scanner sc=new  Scanner(System.in);
		number=sc.nextInt();

		switch (number%2)
		{
			case 0:
				  System.out.println(number+" is Even number.");
				break;
			case 1:
				System.out.println(number+" is Odd number.");
				break;
				
			default:
				System.out.println(" Invalid Input");
			
		}
	}
}