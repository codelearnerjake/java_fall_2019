/* Jacob Borchers
 * Program 11, Due: 11/12/19
 * Partner names: None
 * Description: This program prints out a menu, asks the user for a string input then two integer inputs
 * then prints out the total. Then it asks for a string and repeats or terminates.
 */

package jBorchers_Prog11;
import java.util.Scanner;

public class SammyRentals4
{
	// Do descriptions and method descriptions---------------------------------------------
	
	public static void main (String[] args)
	{
		printWelcome();
		
		do
		{
		String item = getItem();
		
		int hours = getHours();
		
		int minutes = getMinutes();
		
		double itemCost = calculateRate(item);
		
		double itemTotal = calculateCost(hours,minutes,itemCost,2.5);
		
		boolean discount = isDiscount(item, itemTotal);
		
		System.out.printf("\nItem %s for %d hours and %d mintues is $%.2f, dicount: %s \n\n",item, hours, minutes, itemTotal, discount);
		
		}
		while ( repeat());
		
		printThankYou();
		 
		userInput.close();
	}
	
	static Scanner userInput = new Scanner(System.in);
	
	/**
	 * Prints a welcome message
	 */
	public static void printWelcome()
	{
		System.out.print("Welcome to Sammy's Seashore Supplies where it's always a Sunny day at the beach!\n\n");
		System.out.print("Items for rent:\n1) Canoe\n2) Kayak\n3) Surfboard\n4) Beach chair\n5) Umbrella\n" +
				 		 "6) Other (enter the item rented)\n\n");
	}
	
	/**
	 * Asks user for input and returns choice as  string
	 * 
	 * @return: choice User input 
	 */
	public static String getItem()
	{
		System.out.print("What item did you rent?  ");
		String choice = userInput.nextLine();
		return choice;
	}

	/**
	 * Asks user for hours, validates input and returns hours
	 * 
	 * @return: The hours entered by user
	 */
	public static int getHours()
	{		
		int inHours = 0;
		int check = 0;
		while (check == 0)
		{
			System.out.print("How many hours?  ");
			inHours = userInput.nextInt();
			if (inHours >=0) {
				check = 1;
				break;
			}
			System.out.print("Not valid number. Try again.\n");		
		}
		return inHours;
	}
	
	/**
	 * Asks user for minutes, validates input and returns minutes
	 * 
	 * @return: The minutes entered by user
	 */
	public static int getMinutes()
	{
		int inMinutes = 0;
		int check = 0;
		while (check == 0)
		{
			System.out.print("How many minutes?  ");
			inMinutes = userInput.nextInt();
			if (inMinutes >=0 && inMinutes < 60) {
				check = 1;
				break;
			}
			System.out.print("Not valid number. Try again.\n");		
		}
		return inMinutes;
	}
	
	/**
	 * Takes in item rented and returns hourly cost of item
	 * 
	 * @param:userItem The item rented 
	 * @return: The hourly cost of the item
	 */
	public static double calculateRate(String userItem)
	{		
		double hourlyCost;
		switch (userItem.toLowerCase()) {
			case "canoe":
				hourlyCost = 40;
				break;
			case "kayak":
				hourlyCost = 20;
				break;
			case "surfboard":
				hourlyCost = 45;
				break;
			case "beach chair":
				hourlyCost = 10;
				break;
			case "umbrella" :
				hourlyCost = 12;
				break;
			default: 
				hourlyCost = 8.5;			
		}
		return hourlyCost;
	}
	
	/**
	 * Calculate the total cost for renting the item
	 * 
	 * @param: hours Hours item was rented
	 * @param: min Minutes the item was rented
	 * @param: hRate Hourly rate of the item
	 * @param: mRate minute rate of the item
	 * @return: The total cost for renting the item
	 */
	public static double calculateCost(int hours, int mins, double hRate, double mRate)
	{
		return hRate * hours + mRate * mins;
	}
	
	/**
	 * What does
	 * 
	 * @return:
	 */
	public static boolean isDiscount(String itemRent, double costTotal)
	{
		boolean discount = false;
		
		if (costTotal > 100 || itemRent.toLowerCase().equals("umbrella"))
		{
			discount = true;
		}
		
		return discount;
	}
	
	/**
	 * what does 
	 * 
	 * @param: item rented 
	 * @param: hours rented
	 * @param: minutes rented
	 * @param: total cost 

	public static void printCost()
	{
		;
	} */
	
	/**
	 * Asks the user if they rented another item and returns a boolean
	 * 
	 * @return A boolean
	 */
	public static boolean repeat()
	{
		boolean loop = true;
		System.out.print("Did you rent another item?  ");
		String yesOrNo = userInput.next().toLowerCase();
		userInput.nextLine();
		
		if (yesOrNo.equals("no"))
		{
			loop = false;
		}
		
		return loop;
	}
	
	/**
	 * Prints thank you message
	 */
	public static void printThankYou()
	{
		System.out.print("\nThank you for your business.");
	}

}
