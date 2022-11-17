package com.assignment.day2.class_object;

import java.util.Scanner;

public class Employee 
{
         private int emp_No;
		 private String emp_Name;
		 private int basis_Sal,DA,IT,net_Sal,HRA,gross_Sal;
	    public void get_User()
		 {
			 System.out.println("Enter Employee No:");
			 Scanner emp=new Scanner(System.in);
			 int emp_No=emp.nextInt();
			 System.out.println("Enter Employee Name:");
			 Scanner sc=new Scanner(System.in);
			 String emp_Name=sc.next();
			 System.out.println("Enter Employee Basis Salary:");
			 Scanner ba=new Scanner(System.in);
			 int basis_Sal=ba.nextInt();
			 calculate();
			  }
		 public void calculate()
		 {
			 DA=(52/100)*basis_Sal;
			 HRA=(10/100)*basis_Sal;
			 gross_Sal=basis_Sal+DA+HRA;
			 IT=(30/100)*gross_Sal;
			 net_Sal=gross_Sal-IT;
		 }
		 public void show_User()
		 {
			
			    System.out.println("employeeNo :"+emp_No);
			     System.out.println("employeeName:"+emp_Name);
			     System.out.println("basis_Sal:"+basis_Sal);
				 System.out.println("HRA:"+HRA);
				 System.out.println("DA:"+DA);
				 System.out.println("GS:" +gross_Sal);
				 System.out.println("Income Tax:"+IT);
				 System.out.println( "Net_Salary:"+net_Sal); 
		 }
 public static void main(String[] args)
 {
		Employee emp=new Employee();
		emp.get_User();
		emp.show_User();
		emp.calculate();
		
		{
		
		}
	}
}
















