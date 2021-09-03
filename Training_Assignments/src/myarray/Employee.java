package myarray;

import java.util.Scanner;

public class Employee {
   int id;
   String name;
   double salary;
 
   void get()
   {
	   Scanner s= new Scanner(System.in);
	   System.out.println("enter emp id:");
	   id=s.nextInt();
	   System.out.println("enter name:");
	   name=s.next();
	   System.out.println("enter salary:");
	   salary=s.nextDouble();
   }
   void display()
   {
	   System.out.println("emp id:"+id);
	   System.out.println("emp name:"+name);
	   System.out.println("emp salary:"+salary);
   }
   
   public static void main(String args[])
   {
	   Employee e[]=new Employee[3];
	   for(int i=0;i<3;i++)
	   {
		   e[i]=new Employee();
		   e[i].get();
	   }
	   for(int i=0;i<3;i++)
	   {
		   e[i].display();
	   }
   }
   
}
