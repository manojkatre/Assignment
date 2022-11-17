package com.assignment.day6.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class q3_remove_Dup_asec {

	public static void main (String[] args) {
	      ArrayList<Integer> no = new ArrayList<Integer>();
	     no.add(10);
	     no.add(8);
	     no.add(10);
	     no.add(21);
	     no.add(8);
	     System.out.println("Original array no:"+no);
	     Set<String> set = new LinkedHashSet<String>();
	     System.out.println("List after removing duplicate elements:" +set);
	}
	
}
