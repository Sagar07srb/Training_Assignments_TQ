package com.my;

import java.util.Scanner;

public class Divisible_5_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		if((num%5==0) && (num%11==0))
		
			System.out.println("divisible by 5 and 11");
		else
			System.out.println("not divisible by 5 and 11");

	}

}
