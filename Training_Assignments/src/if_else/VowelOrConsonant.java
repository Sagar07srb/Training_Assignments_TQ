package com.my;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		
		char ch ='a';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println(ch+" is Vowel" );
		else
			System.out.println(ch+"is Consonant");

	}

}
