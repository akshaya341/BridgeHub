package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		byte day=Byte.parseByte(args[0]);
		byte month=Byte.parseByte(args[1]);
		int year=Integer.parseInt(args[2]);
		Utility.dayOfWeek(day,month,year);

	}
}
