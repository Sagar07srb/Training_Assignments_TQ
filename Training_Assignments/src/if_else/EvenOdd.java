package com.my;
import java.util.*;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num1=sc.nextInt();
		
		if(num1%2 ==0)
		  System.out.println(num1+" is even");
		else
			System.out.println(num1+" is odd");

	}

}
