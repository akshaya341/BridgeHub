package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the total number of array element");
		int n=Utility.getInt();
		int ar[]=new int[n];
		System.out.println("Enter the your elements ");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=Utility.getInt();
		}
		System.out.println("Entered array elements");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		int res[]=Utility.bubbleSort(ar);
		System.out.println("\nelements in sorted form ");
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(res[i]+" ");
		}
	}
}
