package com.assignment.day4.array;

import java.util.Scanner;
public class lcm_hcf
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,24,38,42};
		int lcm=1,temp=lcm,result=0;
		for(int i=0;i<a.length;i++)
		{
			int no=a[i];
			lcm=(temp*no)/hcf(temp,no);
			temp=lcm;
		}
		for( int j=0;j<a.length;j++)
		{
			result=hcf(result,a[j]);
		}
		System.out.println("lcm is:" +lcm+"  "+"hcf is:" +result);
	}
	private static int hcf(int no_1,int no_2) {
		if(no_2==0)
		{
			return no_1;
		}
		return hcf(no_2,no_1%no_2);
	}
}
	
	
	
	

