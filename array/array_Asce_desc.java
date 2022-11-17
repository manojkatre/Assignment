package com.assignment.day4.array;

public class array_Asce_desc {
public static void main(String[] args) {
	int temp=0;	
	int arr[]= {20,30,1,4,40,50,2,9,80};
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
