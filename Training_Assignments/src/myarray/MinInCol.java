package myarray;

import java.util.Scanner;

public class MinInCol {

	public static int findMin(int[] arr)
	{
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>min)
				min=arr[i];
		}
		return min;
		
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
		
		for(int j=0;j<column;j++)
		{
			int[] temp=new int[column];
			for(int i=0;i<row;i++)
			{
				temp[i]=arr[i][j];
			}
			
			System.out.println("min in column"+j+"="+findMin(temp));
		}
		
		

	}

}
