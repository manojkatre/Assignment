package com.montu.d1;
import java.util.Scanner;
public class fibonacci_series
{
	
	
		  public static void main(String[] args) {

		    int n=100, a=0,b=1;
		    System.out.println("Fibonacci Series 1 to " + n + " :");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(a + ", ");

		      
		      int c= a + b;
		      a = b;
		      b = c;
		    }
		  }
		}
	
	
	
	
	
	
	
	/*
	
int Fibonacci(int range)
{
	int a=0,b=1,c;
	while(a<=range)
	{
		System.out.println("..."+a);
		c=a+b;
		a=b;
		b=c;
	}
	
}
	public static void main(String[] args) {
		int range;
		System.out.println("Enter the range:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("The fibonacci series:");
		Fibonacci(range);
		

	}

}*/
