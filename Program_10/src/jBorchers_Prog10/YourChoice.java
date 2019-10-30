/* Jacob Borchers
 * Program 10, Due: 11/05/19
 * Partner names: None
 * Description: This program asks for an integer, loops an equal number of times to the inputed integer 
 * asking for string inputs on each loop from a list of valid inputs, and displaying how many of each 
 * valid entry was entered
 */

package jBorchers_Prog10;
import java.util.Scanner;

public class YourChoice
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		System.out.print("Welcome! Make a selection and I will print something for you.\n\n");
		System.out.print("1) A song\n2) A nursery rhyme\n3) A haiku\n4) End the Program\n\n");
		System.out.print("Enter your choice:  ");
		int choice = userInput.nextInt();
		
		System.out.printf("You choose %d", choice);
		
		userInput.close();
		
	}
}
