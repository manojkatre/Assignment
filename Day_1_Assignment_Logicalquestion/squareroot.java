package com.montu.demo;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args)    
	{   
	System.out.print("Enter a no: ");  
	Scanner sc = new Scanner(System.in);  
	int n = sc.nextInt();  
	System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	}  
	  public static double squareRoot(int num)   
	{  
	double sq;  
	double squartroot=num/2;  
	do   
	{  
	sq=squartroot;  
	squartroot=(sq+(num/sq))/2;  
	}   
	while((sq-squartroot)!= 0);  
	return squartroot;  
	}  
	}  