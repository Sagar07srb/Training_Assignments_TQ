package strings;

import java.util.Scanner;

public class CountCharOccur
{
   
  public static void main(String args[]) 
  {
 
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the Word:");
	  String str=s.next();
	  
	  System.out.println("enter the char:");
	  String s1=s.next();
	  
	  char search=s1.charAt(0);
	  int occur=0;
  
  for(int i=0;i<s1.length();i++)
  {
	  if(s1.charAt(i)==search)
		  occur++;
  }
  System.out.println("The Character '"+search+"' occurs "+occur+" times.");
  }
}
 