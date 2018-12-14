/*
 * This program find the percentage of head and tail 
 * by generating random number (0-1) to the number toss 
 * and print the Percentage of head and tail on the output Screen
 * @author- AkshayKumar
 * @version - 1.0
 * @since 12/12/2018
 */
package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class CoinFlip 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of toss");
		int n=Utility.getInt();                        // method call from utility class to get user input
		System.out.println(n);                        
		Utility.flip(n);                               // call method flip method from utility class



	}
}