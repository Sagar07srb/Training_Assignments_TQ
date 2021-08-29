package tq;


import java.util.*;

public class Currency {

	public static void main(String[] args) {
		//Input Amount From User
		
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the Amount:");
		int amt=sc.nextInt();
		
		int count2000 = amt / 2000;
		amt=amt % 2000;
		
		int count500 = amt / 500;
		amt=amt % 500;
		
		int count200 = amt / 200;
		amt=amt % 200;
		
		int count100 = amt / 100;
		amt=amt % 100;
		
		int count50 = amt / 50;
		amt=amt % 50;
		
		int count20 = amt / 20;
		amt=amt % 20;
		
		int count10 = amt / 10;
		amt=amt % 10;
		
		int count5 = amt / 5;
		amt=amt % 5;
		
		int count2 = amt / 2;
		amt=amt % 2;
		
		int count1 = amt / 1 ;
		amt=amt % 1;
		
		
		System.out.println("2000 *  "+count2000+"="+(2000 * count2000));
		System.out.println("500 *  "+count500+"="+(500 * count500));
		System.out.println("200 *  "+count200+"="+(200 * count200));
		System.out.println("100 *  "+count100+"="+(100 * count100));
		System.out.println("50 *  "+count50+"="+(50 * count50));
		System.out.println("20 *  "+count20+"="+(20 * count20));
		System.out.println("10 *  "+count10+"="+(10 * count10));
		System.out.println("5 *  "+count5+"="+(5 * count5));
		System.out.println("2 *  "+count2+"="+(2 * count2));
		System.out.println("1 *  "+count1+"="+(1 * count1));
		
		
		
	}

}


