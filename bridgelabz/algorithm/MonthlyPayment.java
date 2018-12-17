package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String[] args) 
	{
		long principle=Long.parseLong(args[0]);
		float rate=Float.parseFloat(args[1]);
		float year=Float.parseFloat(args[2]);
		Utility.monthlyPayment(principle,rate,year);
	}

}
