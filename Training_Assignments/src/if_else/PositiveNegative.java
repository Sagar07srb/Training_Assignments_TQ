package if_else;

import java.util.Scanner;
public class PositiveNegative 
{
    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The given number "+n+" is Negative");
        }
        else
        {
            System.out.println("The given number "+n+" is neither Positive nor Negative ");
        }
    }
}