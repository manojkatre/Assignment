package com.assignment.day4.string;

import java.util.Scanner;

public class repeated_String {
public static void main(String[] args) {
	int count=0;
	System.out.println("Enter the string:");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
   char[] c=str.toCharArray();
		for( int i=0;i<str.length();i++)
		{
			for( int j=i+1;j<str.length();j++)
			if(c[i]==c[j])
			{
				System.out.println("Repeated character:"+c[j]);
				count++;
			    break;
			}
		}
		System.out.println("Repeated character count:"+count);
}
}
