package exceptionHandling;

import java.util.Scanner;

public class DemoException {
public static void main(String[] args) {
		
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		try
		{
			if(a<0)
				throw   new Exception();
			
			System.out.println(10/a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
