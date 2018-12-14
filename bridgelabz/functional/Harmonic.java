/*
 * This program give the Nth Harmonic value
 * and print the Harmonic value on the output Screen
 * 
 * @author- AkshayKumar
 * @version - 1.0
 * @since 12/12/2018
 */
package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Harmonic 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the Nth Harmonic number ");
		int n=Utility.getInt();                                // method call from Utility class to get user input
		Utility ul=new Utility();
		double res=ul.getHarmonic(n);                          // call Harmonic method
		System.out.println(res);
          
	}

}
