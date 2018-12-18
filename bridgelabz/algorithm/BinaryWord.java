package org.bridgelabz.algorithm;


import org.bridgelabz.utility.Utility;


public class BinaryWord 
{
    public static void main(String[] args) 
    {
		System.out.println("Enter the word number of words");
		int n=Utility.getInt();
		System.out.println("Enter the words");
		String [] word= new String[n+1];
		for(int i=0;i<word.length;i++)
		{
			word[i]=Utility.getString();
		}
		for (int i = 1; i < word.length; i++) 
		{
			System.out.print(word[i]+",");
		}
		System.out.println("\nEnter the word do you want to search ");
		String words=Utility.getString();
		
		Utility.binWord(word,words);
		
	}
}
