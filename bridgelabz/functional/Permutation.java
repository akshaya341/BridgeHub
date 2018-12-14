package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Permutation 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String ");
		String st=Utility.getString();
		int n=st.length();
		Utility.permutation(st,0,n-1);
	}

}
