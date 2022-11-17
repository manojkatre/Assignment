package com.assignment.day4.string;

import java.util.Arrays;
import java.util.Scanner;

public class alphabet_asc_des {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	int n=s.length();
	char temp;
	char arr[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
				
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("String in asending order:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
}
