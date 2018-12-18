package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BubbleSortString {
	public static void main(String[] args) {
		String arr[]= {"b","d","a","c","akshay"};
		Utility.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}

	}
}
