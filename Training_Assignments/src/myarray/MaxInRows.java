package myarray;

import java.util.Scanner;

public class MaxInRows {

	public static int findMax(int[] arr)
	{
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
		
	}
	public static void main(String[] args) {
		
		int row,column;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows and col:");
		row=s.nextInt();
		column=s.nextInt();
		int[][] arr= new int[row][column];
		
		System.out.print("Enter elemts in arr:");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				arr[i][j]=s.nextInt();
		
		for(int i=0;i<row;i++)
		{
			int[] temp=new int[column];
			for(int j=0;j<column;j++)
			{
				temp[j]=arr[i][j];
			}
			System.out.println("max in row"+i+"="+findMax(temp));
		}
		
		

	}

}
