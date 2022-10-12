package com.montu.demo;

import java.util.Scanner;

class calculator {
	public static void main(String[] args) {
	int choice,a,b,num;
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a:");
	a=sc.nextInt();
	System.out.println("Enter value of b:");
	b=sc.nextInt();
	System.out.println("Enter a choice: 1.Sum 2.Sub 3.Multi 4.Div");
	Scanner s = new Scanner(System.in);
	 num=s.nextInt();
	switch(num)
	{
	case 1:
		int sum;
		sum=a+b;
		System.out.println("Sum is:"+sum);
     break;
	case 2:
		int sub;
		sub=a-b;
		System.out.println("Sub is:"+sub);
		break;
	case 3:
		int multi;
		multi=a*b;
		System.out.println("Multi is:"+multi);
		break;
	case 4:
		double div;
		div=a/b;
		System.out.println("Div is:"+div);
		break;
		default:
		System.out.println("Incorrect Choice");
	}
	}

}
}