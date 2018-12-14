/*
 * This program prints two dimenstional array
 * rows and column values from user input 
 * 
 * @author- AkshayKumar
 * @version - 1.0
 * @since 12/12/2018
 */
package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class TwoD_Array 
{
	public static void main(String[] args) 
	{
		System.out.println("Number of Rows");
		int m=Utility.getInt();
		System.out.println("Number of columns");
		int n=Utility.getInt();
		Utility.two_Array(m,n);
	}
}
