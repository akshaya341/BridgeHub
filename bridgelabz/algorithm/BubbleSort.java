package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter total number of Array elements: ");
		int n=Utility.getInt();
		System.out.println("Enter the your array elements :");
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=Utility.getInt();
		}

		int res[]=Utility.bubbleSort(ar);
		System.out.println("\nelements in sorted form ");
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
		}
	}
}
