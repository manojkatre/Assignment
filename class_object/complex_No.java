package com.assignment.day2.class_object;

import java.util.Scanner;

public class complex_No 
{
     double real;
     double img;
     
	 public complex_No(double r,double i)
		{
			this.real=r;
			this.img=i;
		}
	public void display()
	{
		System.out.println(this.real+"+i"+this.img);
	}
		public static complex_No add(complex_No n1, complex_No n2)
		{
		complex_No res=new complex_No(0,0);
		res.real=n1.real+n2.real;
		res.img=n1.img+n2.img;
		return res;
}
		public static void main(String args[])
		{
			
			complex_No c1=new complex_No(10,5);
			complex_No c2=new complex_No(8,4);
			System.out.println("First complex no is:");
			c1.display();
			System.out.println("Second complex no is:");
			c2.display();
			complex_No res=add(c1,c2);
			System.out.println("Addition is:");
			res.display();
}
}






/* public static void main(String args[])
{
	System.out.println("Enter real value:");
	Scanner sc=new Scanner(System.in);
	double r=sc.nextDouble();
	
	System.out.println("Enter imaganary value:");
	Scanner s1=new Scanner(System.in);
	double i=s1.nextDouble();

}
	public double display()
	{
		return real+img;
		
	}
	
	
	{	
	
	complex_No n1=new complex_No();
	n1.display();
	System.out.println("JJJJ");
	}
	}*/