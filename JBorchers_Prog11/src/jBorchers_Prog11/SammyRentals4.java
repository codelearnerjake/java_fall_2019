/* Jacob Borchers
 * Program 11, Due: 11/12/19
 * Partner names: None
 * Description: 
 */

package jBorchers_Prog11;
import java.util.Scanner;

public class SammyRentals4
{
	// Do descriptions and method descriptions---------------------------------------------
	
	public static void main (String[] args)
	{
		printWelcome();
		
		String item = getItem();
		
		int hours = getHours();
		
		int minutes = getMinutes();
		
		double itemCost = calculateRate(item);
		
		System.out.printf("%s %d %d $%.2f ",item, hours, minutes, itemCost);
		 
		 
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
			if (inMinutes >=0) {
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
	 * What does
	 * 
	 * @param: hours charge for hours
	 * @param: min charge for minutes
	 * @param: item hourly cost of item
	 * @param: minute time (2.5)
	 * @return:

	public static double calculateCost()
	{
		return total;
	}
	
	/**
	 * What does
	 * 
	 * @return:

	public static boolean isDiscount()
	{
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
	}
	
	/**
	 * what does
	 * 
	 * @return

	public static boolean repeat()
	{
		return loop;
	}
	
	/**
	 * Prints thank you message
	 */
	public static void printThankYou()
	{
		System.out.print("Thank you for your business.");
	}

}
