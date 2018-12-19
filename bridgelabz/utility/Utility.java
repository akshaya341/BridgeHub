package org.bridgelabz.utility;
import java.time.Instant;
import java.util.Arrays;
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
	public static byte getByte()
	{
		byte b=scn.nextByte();
		return b;
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
	public static double distanceCal(double x, double y) 
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
	/*
	 * @param user String 
	 * @param starting index 
	 * @param last index
	 * prints the permutation arrangements
	 */

	public static void permutation(String st, int i, int j) 
	{
		if(i==j)
			System.out.println(st);
		else
		{
			for (int k=i;k<=j;k++) 
			{
				st=swap(st,i,k);      //call swap method
				permutation(st,i+1,j);// recursion call 
				st=swap(st,i,k);
			}
		}
	}
	/*
	 * @param String,first index,second index
	 * 
	 */
	private static String swap(String st, int pos1, int pos2) 
	{
		char temp;
		char[] charArray=st.toCharArray();
		temp=charArray[pos1];
		charArray[pos1]=charArray[pos2];
		charArray[pos2]=temp;
		return String.valueOf(charArray);
	}
	/*
	 * method to find out the Quadratic eqation 
	 * @param of three values(a,b,c)
	 * prints the roots of the equation 
	 */
	public static void quadratic(double a, double b, double c)
	{
		double x1,x2;
		// check a value 
		if(a==0)
		{
			System.out.println("Not a Quadratic equation");
		}
		else 
		{
			// find out the delta value
			double delta=b*b-4*a*c;

			// check delta is greater
			if(delta>0) 
			{
				System.out.println("roots are and unequal");
				// if then find the roots by using sqrt function and print the roots
				x1=(-b+Math.sqrt(delta))/2*a;
				x2=(-b-Math.sqrt(delta))/2*a;
				System.out.println("first root :"+x1);
				System.out.println("first root :"+x2);
			}
			// check is delta is 0
			else if(delta==0)
			{
				System.out.println("roots are and equal");
				// calculate the root and print
				x1=(-b+Math.sqrt(delta))/2*a;
				System.out.println("first root :"+x1);
			}
			// if delta is negative
			else
			{
				System.out.println("roots are complex");
				//calculate the real and complex root and print 
				double a1=-b/(2*a);
				double a2=Math.sqrt(-delta)/(2*a);
				System.out.println("first root :"+a1+" i"+a2);
				System.out.println("Second root :"+a1+" -i"+a2);
			}
		}

	}
	/*
	 * method to calculate the Windchill
	 * @param t is Temperature
	 * @param v is Wind force
	 * prints the windchill result
	 */
	public static void  windchillcal(double t, double v) 
	{
		//temperature should be less than 50
		if(t<50)  
		{
			//wind speed should be in range
			if(v>3 && v<120)
			{
				//formula to calculate the windchill
				double res=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
				System.out.println("The wind chill is: "+res);
			}
			else 
			{
				System.out.println("Entered wind value is not in range :");
			}
		}
		else
			System.out.println("Entered temperature is not in range :");
	}
	/*
	 * method to count the distinct coupon number
	 * compare the user value with random 
	 * print the number of count
	 */
	public static int couponCom(int[] ar) 
	{
		int n=ar.length;
		int count=0;
		// call the method to get highest array element
		int hig=Utility.highest(ar);
		while(n>0)
		{
			Random rn=new Random();
			//generate the random number upto highest element
			int res=rn.nextInt(hig+1);
			// loop to count total number
			for(int i=0;i<n;i++)
			{
				count++;
				//compare random with array element
				if(res==ar[i])
				{
					ar[i]=ar[n-1]; //if elements are same then decrement array length
					n--;
				}
			}
		}
		return count;

	}
	/*
	 * check the highest element in an array
	 * using bubble sort 
	 * @return value
	 */
	private static int highest(int[] ar)
	{
		int arr[]=Utility.bubbleSort(ar);
		return arr[ar.length-1];
	}
	/*
	 * 
	 */
	public static int[]  bubbleSort(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}

		return ar;
	}
	public static String[]  bubbleSort(String ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].compareToIgnoreCase(ar[j])>0)
				{
					String temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}

		return ar;
	}
	
	public static void primeRange(int n) 
	{
		for (int i = 2; i <n; i++) 
		{
			if(Utility.isprime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isprime(int i) 
	{
		int n0=2;
		while(n0<=i/2)
		{
			if(i%n0==0)
			{
			return false;
			}
			n0++;
		}
		return true;
	}
	
	public static void stopWatch() 
	{
		boolean flag=false;
		long start=0,stop=0;
		while(true)
		{
			System.out.println("Enter 1 to start the stopwatch and 0 to stop the watch");
			byte b1=Utility.getByte();
			if(b1==1)
			{
				start=Instant.now().toEpochMilli();
				flag=true;
			}
			else if(b1==0||flag)
			{
				stop=Instant.now().toEpochMilli();
				break;
			}
			else 
			{
				System.out.println("please, enter the valid key");
			}
		}
		System.out.println("The total time elapsed between start and stop is: "+((stop-start)/1000)+"seconds "+(stop-start)%1000+"milli-seconds");
	}
	public static int binarySearch(int[] arr, int l, int h,int x) 
	{
		if(h>=l)
		{
			int mid=l+(h-l)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)
				return binarySearch(arr,l,mid-1,x);
			return binarySearch(arr,mid+1,h,x);
		}
		return -1;
	}

	public static int[] insertionSort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int point=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>point)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=point;
		}
		return arr;
	}
	public static int binSearchString(String[] str, String x)
	{
		int low=0;
		int high=str.length-1;
		int mid=(low+high)/2;
		if(str[mid].compareTo(x)>0) {
			high=mid-1;
		}
		else if(str[mid].compareTo(x)<0)
		{
			low=mid+1;
		}
		else
		{
			return mid;
		}
		return -1;

	}
	public static void tempConversion(byte b) 
	{
		if(b==1)
		{
			System.out.println("enter the celsius value");
			double cl=Utility.getDouble();
			double res=(cl*9/5+32);
			System.out.println("the converted fahrenheit value is : "+res);
		}
		else if(b==2)
		{
			System.out.println("Enter the fahrenheit value ");
			double fh=Utility.getDouble();
			double res1=((fh-32)*5/9);
			System.out.println("the converted celsius value is :"+res1);
		}
		else
		{
			System.out.println("Please, press the valid key ");
		}
	}
	public static void sqrtNewton(double c) 
	{
		double t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println(t);
	}
	
	public static void monthlyPayment(long principle, float rate, float year)
	{
		double R=rate/(12*100);
		float n=12*year;
		double delta=Math.pow((1+R), -n);
		double payment=((principle*R)/(1-delta));
		System.out.println("The monthly payment is :"+payment);
	}
	
	public static void binWord(String[] word, String words)
	{
		Arrays.sort(word);
		int index=Arrays.binarySearch(word,words);
		if(index>0)
		{
		System.out.println("element found at index ="+index);
		}
		else
		{
			System.out.println("word not found !!");
		}
	}
	
	public static void dayOfWeek(byte day, byte month, int year) 
	{
		String ar[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+31*m0/12)%7;
		
		if(d0<=ar.length)
		  {
			 System.out.println("The day falls on "+ar[d0]); 
		  }
		  else
		  {
			  System.out.println("Invalid day");
		  }
	}
	public static boolean isPalindrome(int i)
	{
		int temp=i;
		int rem,rev=0;
		while(i!=0)
		{
           rem=i%10;
           rev=rev*10+rem;
           i=i/10;
		}
		if(temp!=rev)
			return false;
		return true;
	}
	public static void sortTimer()
	{
		int ar[]= {100,200,300,400,500,600,700,800,900,1000};
		long start=System.nanoTime();
		Utility.bubbleSort(ar);
		long stop=System.nanoTime();
	    System.out.println(stop-start+"nano-seconds");
	}
	
	public static void toBinary(int n) 
	{
		String str="";
		
		while(n>0)
		{
			int r=n%2;
			 str=r+str;
			 n=n/2;
		}
		System.out.println("Converted binary value is "+str);
		while((str.length())!=8)
		{
			str="0"+str;
			
		}
		System.out.println("nibble value "+str);
		String l=str.substring(0, 4);
		String m=str.substring(4);
		String res=m+l;
		System.out.println("after swaping the nibbles "+res);
		int dec=Utility.toDecimal(res);
		int bin=Integer.parseInt(res);
	}
	
	public static int toDecimal(int res) 
	{
		
		int p=0; int sum1=0;                  // method not completed
		while(res!=0)
		{
			int r=res%10;
			int sum1=(int) (sum1+r*(Math.pow(2, p)));
			p++;
			res=res/10;
		}
		return sum1;
	}
	
	
	
}




