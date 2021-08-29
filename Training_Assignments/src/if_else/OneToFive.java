package com.my;

import java.util.Scanner;

public class OneToFive {

	public static void main(String[] args) {
		int num;
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter a Number: ");
        num=SC.nextInt();
         
       
        switch(num){
              case 1: 
                  System.out.println("One");
                  break;
              case 2: 
                  System.out.println("Two");
                  break;
              case 3: 
                  System.out.println("Three");
                  break;
              case 4: 
                  System.out.println("Four");
                  break;
              case 5: 
                  System.out.println("Five");
                  break;
                               
              default:
                  System.out.println("incorrect");
                  break;                  
        }
         
    }

}


