package tq;

import java.util.Scanner;

public class Calsi {
	public static void main(String args[]) {
		try {

			int num1, num2, choice;
			int result;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a first number :");
			num1 = s.nextInt();
			System.out.println("Enter a second number :");
			num2 = s.nextInt();

			System.out.println("-----MENU-----");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplition");
			System.out.println("4.Division");

			System.out.println("Enter your choice :");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println("Addition of " + num1 + " + " + num2 + " is " + result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println("Subtraction of " + num1 + " - " + num2 + " is " + result);
				break;

			case 3:
				result = num1 * num2;
				System.out.println("Multiplition of " + num1 + " * " + num2 + " is " + result);
				break;

			case 4: 
				if (num2 == 0) {
					throw new Exception("DivideByZeroError");
				} 
				else {
					result = num1 / num2;
					System.out.println("Division of " + num1 + " / " + num2 + " is " + result);
					break;
				}

			default:
				System.out.println("Wrong Choice");

			}
		} catch (Exception e) {
			System.out.println("Exception Caught: Divide by zero");
		}

	}
}