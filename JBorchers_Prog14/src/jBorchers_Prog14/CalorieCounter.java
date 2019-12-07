/* Jacob Borchers
 * Program 9, Due: 12/09/19
 * Partner names: None
 * Description: 
 */

package jBorchers_Prog14;
import java.util.Scanner;
public class CalorieCounter
{
	static Scanner input = new Scanner ( System.in );
	public static void main ( String [] args )
	{
		Meal yourMeal = new Meal();
		printWelcome();
		String entreeChoice = getEntreeChoice();
		int mmCals = getCals( entreeChoice );
		
		String dessertChoice = getDessertChoice();
		int dCals = getCals( dessertChoice );
		
		yourMeal.setEntree ( entreeChoice );
		yourMeal.setEntreeCals ( mmCals );
		yourMeal.setDessert ( dessertChoice );
		yourMeal.setDessertCals ( dCals );
		yourMeal.setTotalCals();
		
		int tCals = yourMeal.getTotalCals();
		yourMeal.isOver ( tCals );
		
		//Notice how an object can be passed as an argument to a method
		printTotals ( yourMeal );
		input.close();
	}

	/**
	*Prints welcome message
	*/
	public static void printWelcome()
	{
		System.out.println ( "Welcome to the Calorie Counter.\n" );
	}
	/**
	*Gets entree choice from user
	*@return The input from the user that is the entree
	*/
	public static String getEntreeChoice()
	{
		System.out.print( "What was your entree: " );
		String mainMeal = input.nextLine();
		return mainMeal;
	}
	/**
	*Gets dessert choice from user
	*@return The input from the user that is the dessert
	*/
	public static String getDessertChoice()
	{
		System.out.print( "\nWhat was your dessert: " );
		//Since this will happen after a call to nextInt(),
		//need to throw away the EOL
		input.nextLine();
		String dessertMeal = input.nextLine();
		return dessertMeal;
	}
	/**
	*Gets number of calories in a food item
	*@param choice The food item
	*@return The calories in the food item
	*/
	public static int getCals( String choice )
	{
		System.out.printf( "How many calories were in %s: ", choice );
		int numCals = input.nextInt();
		while ( numCals < 0 )
		{
			 System.out.println("Number of calories may not be negative. Try again.");
			 System.out.printf("How many calories were in %s: ", choice );
			 numCals = input.nextInt();
		}
		return numCals;
	}
	/**
	*Prints the summary about the meal
	*/
	//Notice below how an object can be used as a parameter, they are
	//call by reference, like arrays are
	public static void printTotals ( Meal aMeal )
	{
		//below is an example of using the information returned from a
		//method right away instead of storing it in a variable
		System.out.printf("\nYour meal of %s and %s had a total of %d calories.\n", aMeal.getEntree(), aMeal.getDessert(),
		aMeal.getTotalCals());
		//Below here makes use of the ternary conditional operator to
		 //determine which string to print
		System.out.printf("You are %s your suggested calorie total for the day with one meal.\n", aMeal.getUnderCals() ? "under" : "over");
	}
}