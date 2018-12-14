/*
 * This program checks the triplet elements from a given array 
 * returns the combination of triplet elements 
 * and print the triplet elements and along with count triplet on the output Screen
 * 
 * @author- AkshayKumar
 * @version - 1.0
 * @since 12/12/2018
 */
package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Triplet 
{
	public static void main(String[] args) 
	{
		int n=Utility.getInt();           // method call from utility class to get user input
		int ar[]=new int[n];              // create array of input value
		for(int i=0;i<n;i++)
		{
			ar[i]=Utility.getInt();      // store the element in array
		}
		Utility ul=new Utility();
		int res=ul.triForm(ar);
		System.out.println(res);
	}

}
