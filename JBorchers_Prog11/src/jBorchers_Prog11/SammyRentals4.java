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
		
		if (discount)
		{
			itemTotal -= 10;
		}
		
		printCost(item, hours, minutes, itemTotal);
				
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
				 		 "6) Other (enter the item rented)\n");
	}
	
	/**
	 * Asks user for input and returns choice as a string
	 * 
	 * @return: choice User input 
	 */
	public static String getItem()
	{
		System.out.print("\nWhat item did you rent?  ");
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
	 * Asks user for minutes, validates input, and returns minutes
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
	 * The parameters will be the hours, minutes, and rates for each. 
	 * The method will calculate the cost of the rental and will return that value. 
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
	 * Checks if the item rented is "umbrella" or the total cost is greater than 100 
	 * and returns true to indicate if a discount should be
	 * applied or will return false if a discount should not be applied. 
	 * 
	 * @param: itemRent The item selected for rent 
	 * @param: costTotal The total cost for renting the item
	 * @return: boolean for if discount should be applied 
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
	 * The parameters are the item rented, the hours, minutes, and total cost for the rental. 
	 * The method will print the statement that tells the cost of the rental. 
	 * 
	 * @param: pItem The item rented
	 * @param: pHours The hours the item was rented for
	 * @param: pMinutes The minutes the item was rented for 
	 * @param: pItemTotal Total cost of renting item 
	 */
	public static void printCost(String pItem, int pHours, int pMinutes, double pTotal)
	{
		System.out.printf("\nThe cost for renting a %s for %d hours and %d mintues is $%.2f. \n\n",pItem, pHours, pMinutes, pTotal);

	} 
	
	/**
	 * This method will ask the user if another item was rented and will return the user’s answer
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
