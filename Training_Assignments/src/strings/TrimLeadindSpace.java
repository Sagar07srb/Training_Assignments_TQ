package strings;

import java.util.Scanner;

public class TrimLeadindSpace {

	public static void main(String[] args) {
		//String str=" hello";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter to string to trim ");
		String Str=s.nextLine();
		System.out.println("Before trim:"+Str);
		
		Str=Str.trim();
		System.out.println("After trim:"+Str);

	}

}
