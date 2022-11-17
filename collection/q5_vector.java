package com.assignment.day6.collection;

import java.util.Collections;
import java.util.Vector;

public class q5_vector {
	   
	    public static void main(String arg[]) {   
	           
	        Vector<Integer> vect = new Vector<>();  
	        vect.add(5);  
	        vect.add(4);  
	        vect.add(2);  
	        vect.add(3);  
	        vect.add(1); 
	        System.out.println("elements in vector: "+vect);        
	          Collections.sort(vect);  
	           System.out.println("elements in vector after sorting: "+vect);                             
	          }  
	}  
	        

