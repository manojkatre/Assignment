package com.assignment.day4.array;

import java.util.Scanner;

public class sequenceof_Character {
public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	 str=sc.nextLine();
	//char a,e,i,o,u;
	String vowel= "aeiou";
	 char[] vowel_Name=str.toCharArray();
	 char[] cons_Name=str.toCharArray();

for(int j=0;j<str.length();j++)
{
char value = str.charAt(j);
String s=Character.toString(value);
//String value;
if(s==vowel)
{
	//if(vowel.contains(value)) {
	vowel_Name[0]=value;
	System.out.println("vowel:"+vowel_Name);
}
	else if(s!=vowel) 
	{
		cons_Name[0]=value;
		System.out.println("cons:"+cons_Name);
	}
}
}
}
