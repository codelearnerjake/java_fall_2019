/* Jacob Borchers
 * Program 11, Due: 11/19/19
 * Partner names: None
 * Description: This program prompts the user for the number of numbers they would like to test, 
 * prompts for that many numbers to be entered, then for the multiple to test against. It then outputs the multiples,
 * the numbers entered, and whether they are even or odd and the total evens and odds entered. 
 */

package jBorchers_Prog12;
import java.util.Scanner;

public class ArrayMultiples
{
	public static void main (String[] args) 
	{
		printWelcome(); 

		int amount = getTotal();	
		
		int[] testNums = new int[amount];
		
		for (int i= 0; i < amount; i++ )
		{
			System.out.print("Enter a number:  ");			
						
			testNums[i] = userIn.nextInt();
		}
		
		int multiple = getMultiple();
		
		int count = 0;
		for (int numMult : testNums)
		{
			if (numMult % multiple == 0)
			{
				System.out.printf("\n%d is a multple of %d",numMult, multiple);
				count++;
			}
		}
		
		System.out.printf("\nThere were %d multiples of %d\n",count, multiple);
		
		int odd = 0;
		int even = 0;	
		for(int numPrint : testNums)
		{
			String evenOdd;
			if (numPrint % 2 == 0)
			{
				evenOdd = "Even";
				even++;
			}
			else 
			{
				evenOdd = "Odd";
				odd++;
			}
				
			System.out.printf("\n %3d  %4s ", numPrint, evenOdd);
		}
		
		System.out.printf("\nThere were %d evens and %d odds.", even, odd);	
		
		userIn.close();
	}
	
	static Scanner userIn = new Scanner(System.in);
	
	/**
	 * Prints welcome message and instructions for user
	 */
	public static void printWelcome() 
	{
		System.out.print("Enter numbers and a multiple and I will tell you if they "
				+ "are a multiple of your number and if they are odd or even\n\n");
	}
	
	/**
	 * Prompts the user for amount of numbers to be tested, and uses isInvalid method to validate that the
	 * number is greater than 0
	 * 
	 * @return the number entered
	 */
	public static int getTotal() 
	{
		System.out.print("\nHow many numbers do you want to test?  ");
		
		int testAmount = 0;
		do
		{
			testAmount = userIn.nextInt();
			if (!isInvalid(testAmount))
			{
				System.out.print("That is not greater than 0, try again: ");
			}
		}while(!isInvalid(testAmount));
		
		return testAmount;
	}
	
	/**
	 * Prompts the user for the number to be tested for multiples
	 * 
	 * @return the number entered
	 */
	public static int getMultiple() 
	{
		System.out.print("What number would you like to use for a multiple?  ");
		
		int num = userIn.nextInt();
		
		return num;
	}
	
	/**
	 * Validates that the number passed in as the argument is greater than zero
	 * 
	 * @param: numIn the number to test 
	 * @return boolean value whether the number is greater
	 */
	public static boolean isInvalid(int numIn) 
	{
		boolean validate = false;
				
		if (numIn > 0 )
		{
			validate = true; 
		}
		
		return validate;
	}
	
}