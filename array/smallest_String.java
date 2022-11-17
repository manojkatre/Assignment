package com.assignment.day4.array;

public class smallest_String {
	
	static void find_Smallest(String []s, int n)
	{
		for (int i=1;i<n;i++)
		{
		  String temp = s[i];
          int j = i - 1;
		while (j>=0 && temp.length()<s[j].length())
			{
				s[j+1]=s[j];
				j--;
			}
			s[j+1] = temp;
		}
	}
static void Arr_String(String str[], int n)
	{
		for (int i=0;i<n;i++)
			System.out.print(str[i]+" ");
	}
public static void main(String args[])
	{
		String []arr = {"akola","i","from","am"};
		int n = arr.length;
		find_Smallest(arr,n);
		Arr_String(arr, n);
			}
}


