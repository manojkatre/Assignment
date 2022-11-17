package com.assignment.day4.array;

public class third_maximum {
	
public static int third_maximum(int[]a,int total){  
		int temp;  
		for(int i=0;i<total;i++)   
		     {  
		      for (int j = i + 1; j < total; j++)   
		        {  
		       if (a[i]>a[j])   
		                {  
		                temp = a[i];  
		                a[i] = a[j];  
		                 a[j] = temp;  
		                }  
		        }  
		     }  
		       return a[total-3];  
}  
public static void main(String args[]){  
	int a[]={13,25,34,26,19,2};  
	
	System.out.println("Third Maximum no: "+third_maximum(a,6));  
}	
}
