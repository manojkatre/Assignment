package com.montu.demo;

import java.util.Scanner;

public class decimal_to_binary 
{

	public static void main(String[] args)
	{
		
		int b=0b1111;
		System.out.println("Decimal Value of b is "+b);
	
	  int a=15;
      int t=a;
      String x=" ";
      while(t>0) {
          int r=t%2;
          t=t/2;
          x=r+x;
      }
      System.out.println("Binary Value of "  +a+ " " + "is" + " " +x);
  
}
}













		/*System.out.print("Enter a no:");
		Scanner sc = new Scanner(System.in);
	}
			int getDecimal(int binary)
			{  
			    int decimal = 0;  
			    int n = 0;  
			    while(true)
			    {  
			      if(binary == 0)
			      {  
			        break;  
			      } 
			      else
			      {  
			          int temp = binary%10;  
			          decimal += temp*Math.pow(2, n);  
			          binary = binary/10;  
			          n++;  
			       }  
			    }  
			   return decimal;
}
}*/
