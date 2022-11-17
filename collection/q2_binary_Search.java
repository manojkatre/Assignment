package com.assignment.day6.collection;

import java.util.ArrayList;
import java.util.Collections;

public class q2_binary_Search {
	public static void main (String[] args) {
	      ArrayList<Integer> list = new ArrayList<Integer>();
	     list.add(10);
	     list.add(8);
	     list.add(12);
	     list.add(21);
	     list.add(43);
	      int arr = Collections.binarySearch(list, 12); 
	      System.out.println(arr);
	      arr = Collections.binarySearch(list, 3);
	       System.out.println(arr);
	   }
}
