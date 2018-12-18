package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class CheckAnaAndPal
{  
	public static void main(String[] args)
	{
		System.out.println("enter the range");
		int n=Utility.getInt();
		Utility.isPalindrome(n);
		System.out.println("palindrome numbers present in the prime range are");
		for(int i=0;i<n;i++){		
			if(Utility.isprime(i) &&  Utility.isPalindrome(i))
			{
				System.out.print(i+" ");
			}
       }
	}
}
