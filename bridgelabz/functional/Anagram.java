package org.bridgelabz.functional;

import org.bridgelabz.utility.*;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Anagram an= new Anagram();
		String s1=Utility.getString();
		String s2=Utility.getString();
		boolean res=an.isAnagram(s1,s2);
		if(res)
		System.out.println("String is Anagram");
		else
			System.out.println("Not Anagram");
		
	}
	public boolean isAnagram(String s1,String s2)
	{
		int ar1[]=countalp(s1);
		int ar2[]=countalp(s2);
		
		for (int i = 0; i <26; i++) 
		{
			if( ar1[i]!= ar2[i])
			{
				return  false;
			}
				
				
		}return true;
	
	}
	private static int[] countalp(String s1) 
	{
		int ar1[]=new int[26];
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ar1[ch-65]++;
			}
			if(ch>='a' && ch<='z')
			{
				ar1[ch-97]++;
			}
		}
		return ar1;
	}

}
