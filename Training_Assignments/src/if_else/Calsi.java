package com.my;

import java.util.Scanner;

public class Calsi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the 1st Number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the 2nd Number:");
		int num2=sc.nextInt();
		
		int num3=num1+num2;
		System.out.println("addition is "+num3);
		
		int num4=num1-num2;
		System.out.println("subtraction is"+num4);
		
		int num5=num1*num2;
		System.out.println("Multiplication is"+num5);
		
		int num7=num1/num2;
		System.out.println("division is"+num7);
		

	}

}
