package com.assignment.day4.array;

import java.util.Scanner;

public class even_Odd_prime_perfect {

	public static void main(String[] args) throws Exception   
     {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		 System.out.println("1:-Check even or odd number");  
	        System.out.println("2:-Check prime number or not"); 
	        System.out.println("3:-Check perfect number or not"); 
	        System.out.println();  
	        System.out.print("Select any option: "); 
	        int select=sc.nextInt();
	        switch(select)
	        {
	        case 1:
	        	int num;  
                System.out.print("Enter an Integer number: ");  
                Scanner in = new Scanner(System. in );  
                num = in.nextInt(); 
                if (num%2==0) 
                	System.out.println("Entered number is even");  
                else System.out.println("Entered number is odd");  
                break;  
	        case 2:
	        	int temp;  
                boolean isPrime = true; 
              System.out.print("Enter an integer number:");    
                Scanner scan = new Scanner(System.in);  
                int numb = scan.nextInt();  
                for (int i=2;i<=numb/2;i++)   
                {  
                    temp=numb%i;  
                    if (temp==0)   
                    {  
                        isPrime=false;  
                        break;  
                    }  
                }
                    if (isPrime) System.out.println(numb+ "is a Prime Number");  
                    else System.out.println(numb+ "is not a Prime Number");  
            
          case 3:
	        	long n,sum=0;  
	        	int j=1;
	        	Scanner sc1=new Scanner(System.in);         
	        	System.out.print("Enter the number:");  
	        	n=sc.nextLong(); 
	        	 while(j<=n/2)  
	        	{  
	        	if(n%j==0)  
	        	{  
	        		sum = sum +j;  
	        	} 
	        	j++;  
	        	}  
	        	if(sum==n)  
	        	{  
	        	  System.out.println(n+" is a perfect number.");  
	        	}  
	        	else  
	        	
	        	System.out.println(n+" is not a perfect number."); 
	        	break;
	        	}
	        	
	        }
}

