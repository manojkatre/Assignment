package com.assignment.day4.array;

public class remove_Palindrome
{
	static boolean isPalindrome(String str)
		{
	int i = 0, j = str.length() - 1;
			while (i < j)
			{
				if (str.charAt(i++) != str.charAt(j--))
				return false;
			}
			return true;
		}
		static String removePalinWords(String str)
		{
		String final_str = "", word = "";
			str = str + " ";
			int n = str.length();
			
		for (int i = 0; i < n; i++)
			{
			if (str.charAt(i) != ' ')
				word = word + str.charAt(i);
			else
				{
			if (!(isPalindrome(word)))
						final_str += word + " ";
				word = "";
				}
			}
			return final_str;
		}
		public static void main (String[] args)
		{
			String str = "abs aba nbb cbs";
		System.out.print(removePalinWords(str));
		}
	}

	
	
