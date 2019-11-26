/* Jacob Borchers
 * Program 13, Due: 11/26/19
 * Partner names: None
 * Description: This program asks the user for sales values for each day of the week then outputs
 * the highest sale and the corresponding day, lowest and corresponding day, average and total of the sales. 
 */

package jBorchers_Prog13;
import java.util.Scanner;

public class SalesReport
{
	public static void main(String[] args)
	{
		String[] workWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		double[] sales = new double[5];
		
		printTitle();	
		getSales(workWeek, sales);
		printSales(workWeek, sales);
		
		int indexHigh = calculateHighest(sales);
		int indexLow = calculateLowest(sales);
		
		System.out.printf("\nThe highest was on %s and was $%4.2f.\n", workWeek[indexHigh], sales[indexHigh]);
		System.out.printf("The lowest was on %s and was $%4.2f.\n", workWeek[indexLow], sales[indexLow]);
		System.out.printf("The total is  $%4.2f.\n", findTotal(sales));
		System.out.printf("The average is  $%4.2f.", findAverage(sales));		
		userIn.close();
	}
	
	static Scanner userIn = new Scanner(System.in);
	
	/**
	 * Prints report title
	 */
	public static void printTitle() 
	{
		System.out.print("Company Logistics Co. Sales Report\n\n");
	}
	
	/**
	 * Accepts two arguments: a string array of days and an array of doubles and asks the user to 
	 * enter the sales per day. 
	 * 
	 * @param days String array of days
	 * @param sales Double array of sales
	 * 
	 */
	public static void getSales(String[] days, double[] sales)
	{
		for (int i = 0; i < days.length; i++ )
		{
			double numIn = -1;
			do 
			{
				System.out.printf("Enter sales for %s:  ", days[i]);
				
				numIn = userIn.nextDouble();
				
				if(!isInvalid(numIn)) 
				{
					System.out.print("Cannot be negative\n");
				}
			} while(!isInvalid(numIn));
			
			sales[i] = numIn;
		}		
	}
	
	/**
	 * Takes in double as argument and validates if greater than zero
	 * 
	 * @param testNum double to test
	 * @return boolean if number is greater
	 */
	public static boolean isInvalid(double testNum)
	{
		boolean validate = false;
		if (testNum > 0 )
		{ 
			validate = true;
		}
		
		return validate;
	}
	
	/**
	 * Accepts two arguments: a string array of days and an array of doubles 
	 * and prints out the two arrays
	 * 
	 *  @param weekDays A string array of the days of the week
	 *  @param sales Double array of sales to match to the days
	 */
	public static void printSales(String[] weekDays, double[] sales)
	{
		System.out.print("\nSales per day:\n\n");
		
		for (int i = 0; i < weekDays.length; i++ )  
		{
			System.out.printf("%-14s   ", weekDays[i]);
			
			System.out.printf("$%4.2f\n", sales[i]);		
		}	
	}
	
	/**
	 * Accepts a array of doubles to evaluate the highest value 
	 * 
	 * @param sales An array of doubles
	 * @return the index of the highest value
	 */
	public static int calculateHighest(double[] sales)
	{
		int highest = 0;
		
		for (int i = 1; i < sales.length; i++)
			if (sales[i] > sales[highest])
			{ 
				highest = i;
			}
		return highest; 
	}
	
	/**
	 * Accepts a array of doubles to evaluate the lowest value 
	 * 
	 * @param sales An array of doubles
	 * @return the index of the lowest value
	 */
	public static int calculateLowest(double[] sales)
	{
		{
			int lowest = 0;
			
			for (int i = 1; i < sales.length; i++)
				if (sales[i] < sales[lowest])
				{ 
					lowest = i;
				}
			
			return lowest; 
		}
	}
	
	/**
	 * Accepts a array of doubles to calculate the average
	 * 
	 * @param sales An array of doubles
	 * @return the average of the values
	 */
	public static double findAverage(double arrayForAvg[])
	{
		double avg = 0;
		int count = 0;	
		
		for (; count < arrayForAvg.length; count++ )
		{
			avg += arrayForAvg[count];		
		}
		
		return avg / count; 
	}
	
	/**
	 * Accepts a array of doubles to calculate the total. 
	 * 
	 * @param sales An array of doubles
	 * @return the the total of the array values
	 */
	public static double findTotal(double[] arrayForTotal)
	{
		double total = 0;			
		for (int i = 0; i < arrayForTotal.length; i++ )
		{
			total += arrayForTotal[i];		
		}
		return total;
	}	
}


