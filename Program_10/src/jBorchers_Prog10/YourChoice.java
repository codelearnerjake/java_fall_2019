/* Jacob Borchers
 * Program 10, Due: 11/05/19
 * Partner names: None
 * Description: This program asks the user to choose between three menu options to print or end the program
 */

package jBorchers_Prog10;
import java.util.Scanner;

public class YourChoice
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		printWelcome();
		
		int loop = 0;
		while (loop == 0 )
		{
			printMenu();
			
			int choice = userInput.nextInt();
			
			int check = 0;
			while (check == 0)
			{
				if (choice <= 4 && choice > 0) 
				{
					check = 1;
					break;

				}
			
			System.out.print("That was not a menu choice. Try agian:  ");
			choice = userInput.nextInt();
			}
			
			switch (choice)
			{
			case 1:
				printSong();
				break;
			case 2:
				printRhyme();
				break;
			case 3:
				printHaiku();
				break;				
			case 4: 
				endProgram();
				loop = 1;
				break;
			}
			
		}
		
		userInput.close();
		
	}
	
	/**
	 * Prints a welcome message
	 */
	public static void printWelcome()
	{
		System.out.print("Welcome! Make a selection and I will print something for you.\n\n");
	}
	
	/**
	 * Prints the menu options
	 */
	public static void printMenu()
	{
		System.out.print("1) A song\n2) A nursery rhyme\n3) A haiku\n4) End the program\n\n");
		System.out.print("Enter your choice:  ");
	}
	
	/**
	 * Prints a song
	 */
	public static void printSong() 
	{
		System.out.print("\nThe lights go out and I can't be saved\n");
		System.out.print("Tides that I tried to swim against\n");
		System.out.print("Have brought me down upon my knees\n");
		System.out.print("Oh I beg, I beg and plead, singing\n");
		System.out.print("Clocks, Coldplay\n\n");
	}
	
	/**
	 * Prints a nursery rhyme
	 */
	public static void printRhyme()
	{
		System.out.print("\nRow, row, row your boat, gently down the stream\n");
		System.out.print("Merrily, merrily, merrily, merrily, life is but a dream\n\n");
	}
	
	/**
	 * Prints a haiku
	 */
	public static void printHaiku()
	{
		System.out.print("\nA discovery!\n");
		System.out.print("On my frog's smooth green belly\n");
		System.out.print("there sits no button.\n");
		System.out.print("Frog Haiku, Yaku\n\n");
	}
	
	/**
	 * Ends the program
	 */
	public static void endProgram()
	{
		System.out.print("\nThank you for your time.");
	}
	
}
