package com.assignment.day6.collection;

import java.util.ArrayList;
import java.util.Collections;

public class q4_remove_Name_desc {
	public static void main (String[] args) {
	     ArrayList<String> name = new ArrayList<String>();
	     name.add("vaibhav");
	     name.add("akshay");
	     name.add("ram");
	     name.add("vaibhav");
	     name.add("ram");
	     name.add("lalit");
	     System.out.println("Original arraylist:"+name);
	     Object[] st=name.toArray();
	     for(Object s:st)
	     {
	   if(name.indexOf(s)!=name.lastIndexOf(s))
	    	 {
	     name.remove(name.lastIndexOf(s));
	    	 }
	     }
	     System.out.println("removing duplicate element:"+name);
	     Collections.sort(name);
	     System.out.println("after removing list in descending order:"+name);
}
}