package com.assignment.day4.string;

public class stringbuffer_Stringbuilder {
	
		
		public static void StrBuff(StringBuffer s1)
		{

		String s="";
			s = s1 + s;
		}
		public static void StrBuil(StringBuilder s2)
		{
			String s="";
			s = s2 + s;
		}
		public static void main(String args[]){
		StringBuffer s1 = new StringBuffer("pune");
		StrBuff(s1);
		System.out.println( "The stringBuffer is:"+s1);

		StringBuilder s2 = new StringBuilder("mumbai");
		StrBuil(s2);
		System.out.println( "The stringBuilder is:"+s2);

		}
		}

