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
		//int ch = 0;
		//switch(ch)
		{
		
		}
	}
}



















/*public Employee(int emp_no,String emp_Name,int basis_Sal,int DA,int IT,int net_Salary)
{
	this.emp_No=emp_no;
	this.emp_Name=emp_Name;
	this.basis_Sal=basis_Sal;
	this.DA=DA;
	this.IT=IT;
	this.net_Salary=net_Salary;
}
public int getEmp_No() {
	return emp_No;
}
public void setEmp_No(int emp_No) {
	this.emp_No = emp_No;
}
public String getEmp_Name() {
	return emp_Name;
}

public void setEmp_Name(String emp_Name) {
	this.emp_Name = emp_Name;
}
public int getBasis_Sal() {
	return basis_Sal;
}
public void setBasis_Sal(int basis_Sal) {
	this.basis_Sal = basis_Sal;
}

public int getDA() {
	return DA;
}
public void setDA(int dA) {
	DA = dA;
}

public int getIT() {
	return IT;
}
public void setIT(int iT) {
	IT = iT;
}
public int getNet_Salary() {
	return net_Salary;
}

public void setNet_Salary(int net_Salary) {
	this.net_Salary = net_Salary;
}

}*/
		 