package org.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;


public class Utility 
{
	/*
	 * create Scanner class object to take input from user
	 * and make Scanner as static to avoid creating scanner every time in main method
	 */
	static Scanner scn=new Scanner(System.in);
	/*
	 * call this method to get integer values
	 * and return the integer value
	 */
	public static int getInt()
	{
		int n=scn.nextInt();
		return n;
	}
	//call this method to get double values from user input and return 
	public static double getDouble()
	{
		double n=scn.nextDouble();
		return n;
	}
	//call this method to get String from user input and return 
	public static String getString()
	{
		String n=scn.nextLine();
		return n;
	}
	// call this method to get float values from user input and return 
	public static float getFloat()
	{
		float n=scn.nextFloat();
		return n;
	}
	/*
	 * this method is used to convert the n value into 2^n
	 * @parameter i is indicating the base value
	 * @parameter n is indicating the power value
	 * @return the 2th power of n number
	 */
	public int get(int i, int n) 
	{
		int pw=1;
		while(n>0)
		{
			pw=pw*i;
			n--;
		}
		
		return pw;
		
	}
	/*
	 * this method is used to check and return triplet values
	 * @parameter it takes integer array as parameter
	 * it checks whether sum of 3 array elements are equals to zero
	 * @return if, then return those 3 array elements and their count
	 */
	int count=0;
	public int triForm(int ar[]) 
	{

		for (int i = 0; i <ar.length ; i++) // to take one by one element 
		{
			for(int j=i+1; j<ar.length;j++) // take next element of array element and followed
			{
				for(int k=j+1; k<ar.length; k++) // take next to next array element and followed
				{
					if(ar[i]+ar[j]+ar[k]==0)     // check condition to compare 3 elements 
					{
						count++;
						System.out.println("[" +ar[i]+","+ar[j]+","+ar[k]+"]");
					}


				}
			}

		}
		return count;


	}
	/*
	 * this method is used to return the sum of the Nth Harmonic value
	 * @parameter it takes integer value of user input number
	 *  @return sum of harmonic value
	 */
	double sum=0;
	public double getHarmonic(int n)
	{

		for (double i = 1; i <=n; i++) 
		{
			if(n!=0)              // number should not be zero
			{
				sum=sum+(1.0/i);

			}

		}
		return sum;
	}
	/*
	 * this method used to find the percentage of head and tail between 0 to 1 Random number
	 * @parameter As number of toss
	 * if Random value is below than 0.5 then count tail else head
	 * print the percentage of head and tail
	 */
	public static void flip(int n) 
	{
		float  head=0,tail=0;
		float res,res1;
		Random rn= new Random(1);
		for (int i = 0; i <n; i++)    // generate the random number upto number of toss
		{

			Float d1=rn.nextFloat();  
			if(d1>0.5)                 // loop to check Random number is greater than 0.5
			{
				System.out.println("coin flip : head");
				head++;

			}
			else
			{
				System.out.println("coin flip : tail");
				tail++;
			}
		} 

		res=(head/n)*100;
		res1=((tail/n)*100);
		System.out.println("percentage of head "+res);
		System.out.println("percentage of tail "+res1);
	}
	/*
	 * this method replaces the <<username>> from String of the user choice
	 * @parameter of given String type
	 * print the replaced username String 
	 */
	public static void getStringReplace(String st) 
	{

		String str=Utility.getString();
		if(str.length()<3)              // character must be atleast 3 
		{
			System.out.println("Please, Enter the atleat 3 character");

		}
		else 
		{
			String temp="";              //create the temporary variable 
			temp=st.substring(0, 6);     //store the substring into variable
			temp+=str;                   //Concatenate substring along with user
			temp+=st.substring(18,32);   // and with remaining substring
			System.out.println(temp);
		}
	}
	/*
	 * Method is used to find leap year
	 * @param String type values
	 * prints the Message 
	 */
	public static void isLeap(String str)
	{
		if(str.length()<4 || str.length()>4)  //checks the length of values
		{
			System.out.println("please enter four digit number");
		}
		else {
			int n=Integer.parseInt(str);         // convert the String into integer form
			if(n%4==0 && n%100 !=0 ||n%400==0)   // check condition for leap year
			{
				System.out.println("Year is Leap");
			}
			else
			{
				System.out.println("Not a leap Year");
			}
		}

	}
	/*
	 * @param usre input value
	 * generate the Prime factor number 
	 * @return prime factor number
	 */
	public static void prime_Factor(int n) 
	{
		//checks number is even or odd if then divide by 2
		while(n%2==0)
		{
			System.out.print(2 + " ");
			n=n/2;
		}
		//for loop to get prime numbers b/w n value
		for (int i = 3; i*i<=n; i=i+2) 
		{
			//checks the condition for prime number if then divide number by respective prime number
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		//print if number is greater than 2 
		if(n>2)
			System.out.print(n);
	}
	/*@param m-number of rows
	 * @param n-number of column
	 * prints 2-D array
	 */
	public static void two_Array(int m, int n) 
	{
		// new array of length m*n
		int ar[][]=new int[m][n];
		System.out.println("enter the elements");
		//read the elements from user
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ar[i][j]=Utility.getInt();
			}
		}
		//store the elements in array and print
		System.out.println("2-D Array :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	/*
	 * @param two distance values from user
	 *@return calculated the Euclidean distance
	 */
	public static double distanceCal(int x, int y) 
	{
		double r=Math.pow(x,2);          // square of first distance 
		double r1=Math.pow(y, 2);        // square of second distance
		double distance=Math.sqrt(r+r1);
		return distance;
	}
	/*
	 * method to find power of two number
	 * @param one is base number
	 * @param one is power number
	 * @return powered number
	 */
	public int pow(int i, int n)
	{
	  int pw=1;
	  //loop for generate power 
	  while(n>0)   
	  {
		  pw=pw*i;
		  n--;
	  }
	return pw;
	}
	
	public static void permutation(String st, int i, int j) 
	{
		if(i==j)
			System.out.println(st);
		else
		{
			for (int k=i;k<=j;k++) 
			{
               st=swap(st,i,k);
               permutation(st,i+1,j);
               st=swap(st,i,k);
			}
		}
		System.out.println(st);
	}
	
	private static String swap(String st, int pos1, int pos2) 
	{
		char temp;
		char[] charArray=st.toCharArray();
		temp=charArray[pos1];
		charArray[pos1]=charArray[pos2];
		charArray[pos2]=temp;
		return String.valueOf(charArray);
	}
}
	
	
	
	
