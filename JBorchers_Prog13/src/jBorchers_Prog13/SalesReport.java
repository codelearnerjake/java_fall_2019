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
		
		for (String x : workWeek) 
		{
			System.out.printf("%s   ", x);
			
			for (double y : sales)
			{
				System.out.printf("$%d\n", y);
			}
		
		}
		

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
	 * Check on this as best method? does I need to be there? 
	 * 
	 */
	public static void getSales(String[] days, double[] sales)
	{
		for (String x: days)
		{
			int i = 0; 
			System.out.printf("Enter sales for %s:  ", x);
			
			sales[i] = userIn.nextDouble();
			i++;
			
		}
	}
	
	/**
	 * 
	 * @return
	 
	public static boolean isInvalid()
	{
		;
	}
	
	/**
	 * Check loop method, might be better way
	 */
	public static void printSales(String[] weekDays, double[] sales)
	{
		System.out.print("Sales per day:\n\n");
		
		int i = 0;
		for (String x : weekDays)
		{
			System.out.printf("%14s   $%4.2d", x, sales[i]);
			i++;
		}
	}
	
	/**
	 * d
	 * 
	 * @return
	 
	public static int calculateHighest()
	{
		;
	}
	
	/**
	 * d
	 * 
	 * @return
	 
	public static int calculateLowest()
	{
		;
	}
	
	/**
	 * d
	 * 
	 * @return
	 
	public static double findAverage()
	{
		;
	}
	
	/**
	 * Will calculate the total of the sales and return that amount
	 * 
	 * @return
	 
	public static double findTotal()
	{
		;
	}*/	
}


