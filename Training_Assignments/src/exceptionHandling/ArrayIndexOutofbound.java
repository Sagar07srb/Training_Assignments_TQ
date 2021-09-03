package exceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutofbound {

	public static void main(String args[]){
	      int[] myArray = {1254, 1458, 5687,1457, 4554, 5445, 7524};
	      System.out.println("Elements in the array are: ");
	      System.out.println(Arrays.toString(myArray));
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the index of the required element: ");
	      int element = sc.nextInt();
	      System.out.println("Element in the given index is :: "+myArray[element]);
	   }

}
