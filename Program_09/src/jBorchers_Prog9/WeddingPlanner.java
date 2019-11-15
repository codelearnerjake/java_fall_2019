/* Jacob Borchers
 * Program 9, Due: 10/29/19
 * Partner names: None
 * Description: This program asks for an integer, loops an equal number of times to the inputed integer 
 * asking for string inputs on each loop from a list of valid inputs, and displaying how many of each 
 * valid entry was entered
 */

package jBorchers_Prog9;
import java.util.Scanner;

public class WeddingPlanner
{
	public static void main(String[] args)
	{
		System.out.print("Welcom to Tying the Knot Wedding Planer Guide\n\n");
		System.out.print("For each guest, please enter he/her choice for dinner: Beef, Chicken, Fish, or Vegetarian.");
		Scanner userInput = new Scanner (System.in);
		
		int guestCheck = 0; 
		int guests = 0;
		while (guestCheck != 1)
		{

			System.out.print("\nHow many guest will there be?  ");
			guests = userInput.nextInt();
			if (guests > 0)
			{
				guestCheck = 1;
			}
			else 
			{
				System.out.print("Not valid number of guests, try agian.");
			}
		}
		
		int beef= 0;
		int chicken = 0;
		int fish = 0;
		int veg = 0;
		
		int loops = 1;
		int meals = guests;
		for (; meals > 0; meals--) 
		{
			System.out.printf("Meal choice for guest %d:  ", loops);
			String choice = userInput.next().toLowerCase();
			
			switch (choice)
			{
				case "beef":
					beef += 1;
					break;
				case "chicken":
					chicken += 1;
					break;
				case "fish":
					fish += 1;
					break;
				case "vegetarian":
					veg += 1;
					break;
				default:
					break;	
			}		
			
			loops += 1;
			
		}
		
		System.out.printf("\nThere will be %s meals.\n", guests);
		System.out.printf("%d Beef\n%d Chicken\n%d Fish\n%d Vegetarian\n\n",beef, chicken, fish, veg);
		
		
		
		userInput.close();
		System.out.print("Thank you for your business.");
	}
}
