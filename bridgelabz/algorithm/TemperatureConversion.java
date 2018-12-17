package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		System.out.println("To convert celsius to fahrenheit press 1 and fahrenheit to celsius press 2 ");
		byte b=Utility.getByte();
		Utility.tempConversion(b);
	}
}
