package com.techpalle;

import java.util.Scanner;

public class MyProgramAss {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println("1:Create 2:Insert 3:Update 4:Delete 5:Exit");
		int no=sc.nextInt();
		
		if(no==1)
		{
			Employee.create();
		}
		else if(no==2)
		{
			System.out.println("Enter employee name");
			String n=sc.next();
			
			System.out.println("Enter employee salary");
			int s=sc.nextInt();
			
			Employee.insert(n,s);
			
		}
		else if(no==3)
		{
			System.out.println("Enter employee id");
			int i=sc.nextInt();
			
			System.out.println("Enter employee name");
			String name=sc.next();
			
			System.out.println("Employee employee salary");
			int sal=sc.nextInt();
			
			Employee.update(i,name,sal);
		}
		else if(no==4)
		{
			System.out.println("Enter row no to delete :");
			int d=sc.nextInt();
			Employee.delete(d);  
		}
		else
		{
			System.exit(0);
		}
		sc.close();

	}

}
