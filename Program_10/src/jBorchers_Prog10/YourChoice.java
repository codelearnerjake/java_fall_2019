/* Jacob Borchers
 * Program 10, Due: 11/05/19
 * Partner names: None
 * Description: This program asks the user to choose between three thrings to print or ends the program
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
	
	/**
	 * Prints a song
	 */
	public static void printSong() 
	{
		;
	}
	
	/**
	 * Prints a nursery rhyme
	 */
	public static void printRhyme()
	{
		;
	}
	
	/**
	 * Prints a haiku
	 */
	public static void printHaiku()
	{
		;
	}
	
	/**
	 * Ends the program
	 */
	public static void endProgram()
	{
		;
	}
	
}
