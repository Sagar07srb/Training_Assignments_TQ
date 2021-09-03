package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st word:");
		String str1 = s.next();

		System.out.println("Enter 2nd word:");
		String str2 = s.next();

		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();

		Arrays.sort((ch1));
		Arrays.sort((ch2));
		if (ch1.length == ch2.length) 
		{
			if (Arrays.equals(ch1, ch2))
			{
				System.out.println("Given strings are anagrams");//eg. keep and peek
			}
			else
				System.out.println("Given strings are not anagrams");
		}
		else
			System.out.println("no");
	}
}
