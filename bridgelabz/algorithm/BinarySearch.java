package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BinarySearch 
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
		System.out.println("Entered array elements");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		int arr[]=Utility.bubbleSort(ar);
		System.out.println("\nElements in sorted form");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		int n1=ar.length;
		int x=25;

		System.out.println();
		int res=Utility.binarySearch(arr,0,n1-1,x);
		System.out.println("The searched number present in index "+res);
	}
}
