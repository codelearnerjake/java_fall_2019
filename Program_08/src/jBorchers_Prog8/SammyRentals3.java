/* Jacob Borchers
 * Program 8, Due: 10/22/19
 * Partner names: None
 * Description: This program prompts the user for three inputs, calculates total off of the inputs then prompts
 * the user for another input which will either loop to the first input or terminate the program.
 */

package jBorchers_Prog8;
import java.util.Scanner;

public class SammyRentals3
{
	public static void main (String[] args) 
	{
		System.out.println("Welcome To Sammy's Seashore Rentals payment kiosk\n");
		
		System.out.print("Items for rent:\n"+
						 "1) Canoe\n" + 
						 "2) Kayak\n" + 
						 "3) Surfboard\n" + 
						 "4) Beach chair\n" + 
						 "5) Umbrella\n" +
						 "6) Other (please enter item)\n");
		
		
		Scanner userInput = new Scanner(System.in);
		
		int newitem = 0;		
		while (newitem != 1)
		{
			System.out.print("\nWhat item did you Rent? ");
			String thing = userInput.nextLine().toLowerCase();
			
			double hourlyCost = 0;
			switch (thing) {
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
			
			
			//check for valid hour entry
			int hoursloop = 0;
			int hours = 0;
			while (hoursloop != 1) 
			{
				System.out.printf("How many hours did you rent the %s?  ", thing);
				hours = userInput.nextInt();
				
				if(hours >= 0) 
				{ 
					hoursloop = 1;
				}
				else
				{
					System.out.print("Not valid entry, please try again\n");
				}
			}
			
			//check for valid minute entry
			int minloop = 0;
			int minutes = 0;
			while (minloop != 1)
			{
				System.out.printf("How many minutes did you rent the %s?  ", thing);
				minutes = userInput.nextInt();
				
				if (minutes < 0 || minutes > 59)
				{
					System.out.print("Not valid entry, please try again\n");
				}
				else
				{
					minloop = 1;
				}
			}
			
			double total = hourlyCost * hours + minutes * 2.5;
			if (total > 100 || hourlyCost == 12)
			{
				total -= 10; 
			}
			
			System.out.printf("\nCost of %s for %d hours and %d minutes is $%4.2f\n", thing, hours, minutes, total);
			
			
			//need to loop back through 
			System.out.print("\nDid you rent another item? ");
			String moreItems = userInput.next().toLowerCase();
			userInput.nextLine();
			String compareNo = "no";
			if (moreItems.equals(compareNo))
			{
				newitem = 1;
			}
		}

		userInput.close();
		System.out.printf("\nThank you and have a wonderful day!" );
	}
}
