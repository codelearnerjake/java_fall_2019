/* Jacob Borchers
 * Program 13, Due: 11/26/19
 * Partner names: None
 * Description: 
 */

package jBorchers_Prog13;
import java.util.Scanner;

public class SalesReport
{
	//Do description and method javadocs
	public static void main(String[] args)
	{
		String[] workWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		double[] sales = new double[5];
		
		
		printTitle();
		getSales(workWeek, sales);
		
		printSales(workWeek, sales);
		
		
		int indexHigh = calculateHighest(sales);
		int indexLow = calculateLowest(sales);
		System.out.printf("The highest was on %s and was $%4.2f", workWeek[indexHigh], sales[indexHigh]);
		System.out.printf("The lowest was on %s and was $%4.2f", workWeek[indexLow], sales[indexLow]);
		System.out.printf("The average is  $%4.2f", findAverage(sales));
		System.out.printf("The total is  $%4.2f", findTotal(sales));
		
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
	 * do
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
	 * 
	 * @return
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
	 * Check loop method, might be better way
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
	 * d
	 * 
	 * @return
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
	 * d
	 * 
	 * @return
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
	 * d
	 * 
	 * @return
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
	 * Will calculate the total of the sales and return that amount
	 * 
	 * @return
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


