package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Gambler 
{
  public static void main(String[] args) 
  {
	  System.out.println("Enter the Stake value :");
	  int stake=Utility.getInt();
	  System.out.println("Enter the Goal value :");
	  int goal=Utility.getInt();
	  System.out.println("Enter how many times do you want to play");
	  int number=Utility.getInt();
	  Utility.gamblerGame(stake,goal,number);
	
}
}
