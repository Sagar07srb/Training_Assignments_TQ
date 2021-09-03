package strings;

import java.util.Scanner;
public class FindLongestWord {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		String str1;
		System.out.println("Enter your String:");
		str1=cs.nextLine();
		str1+=" ";
		//splitting Input String into sub string
		String[] sub_str=str1.split("\\s");
		int in,len1,maxInd=0,max=0;
	    
	  //finding max length of Substring from splitting string length
	    int len=sub_str.length;
	    max=sub_str[0].length();
	        for(in=0;in<len;in++)
	        {
	            len1=sub_str[in].length();
	            if(len1>max)
	            {
	                max=len1;
	                maxInd=in;
	            }
	        }
	       System.out.print("Longest Word is:: "+sub_str[maxInd]+"\n");
	    cs.close();
	}
}