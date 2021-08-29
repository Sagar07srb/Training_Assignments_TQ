package com.my;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("It is Leap year");
		}
		else
			System.out.println("Not a Leap year");

	}

}
