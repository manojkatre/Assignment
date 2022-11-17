package com.assignment.day4.string;

import java.util.Scanner;
public class two_String
{
	public static String insert_String(String str1,String str2,int index)
	{
		String new_str=new String();
	for(int i=0;i<str1.length();i++)
	{
		new_str+=str1.charAt(i);
		
		if(i==index)
		{
			new_str+=str2;
		}
		}
	return new_str;
}
public static void main(String[] args) {
	System.out.println("Enter the first String:");
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	System.out.println("Enter the second String:");
	Scanner sc=new Scanner(System.in);
	String str2=sc.next();
	System.out.println("Enter the Index no:");
	Scanner s1=new Scanner(System.in);
	int index=s1.nextInt();
	System.out.printf("First String:"+str1+"n","Second String"+str2+"n","Index no:"+index+"n");
	System.out.println("New String:"+insert_String(str1,str2,index));
	}
}