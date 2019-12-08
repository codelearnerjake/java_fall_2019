package jBorchers_Prog14;

public class Meal {
	private String entree; 
	private String dessert;
	private int entreeCals;
	private int dessertCals;
	private int totalCals;
	private boolean underCals;
	
	public Meal () {
	}
	
	public Meal (String entree, String sweetTreat)
	{
		entree = this.entree;
		sweetTreat = dessert;
	}
	
	/**
	 * Setter method for private string entree
	 * 
	 * @param food 	Entree name
	 */
	public void setEntree(String food)
	{
		entree = food; 
	}
	
	/**
	 * Setter method for private string dessert
	 * 
	 * @param sweet Desert name	
	 */
	public void setDessert(String sweet)
	{
		dessert = sweet;
	}
	
	/**
	 * Setter method for private int entreeCals
	 * 
	 * @param foodCals Entree calories
	 */
	public void setEntreeCals(int foodCals)
	{
		entreeCals = foodCals;
	}
	
	/**
	 * Setter method for private int sweetCals
	 * 
	 * @param dessertCals Dessert Calorie	
	 */
	public void setDessertCals(int sweetCals)
	{
		dessertCals = sweetCals;
	}
	
	/**
	 * Assigns sum of dessertCals and entreeCals to totalCals
	 */
	public void setTotalCals() 
	{
		totalCals = dessertCals + entreeCals;
	}
	
	/**
	 * Setter method for private int sweetCals
	 * 
	 * @param under the boolean for whether they are under or over daily calorie count
	 */
	public void SetUnderCals(boolean under)
	{
		underCals = under;
	}
	
	/**
	 * Returns entree name 
	 * 
	 * @return entree name
	 */
	public String getEntree() 
	{
		return entree;
	}
	
	/**
	 * Returns dessert name
	 * 
	 * @return dessert name
	 */
	public String getDessert()
	{
		return dessert;
	}
	
	/**
	 * Returns entree calories int
	 * 
	 * @return entree calories
	 */
	public int getEntreeCals() 
	{
		return entreeCals;
	}
	
	/**
	 * Returns dessert calories int
	 * 
	 * @return dessert calories
	 */
	public int getDessertCals()
	{
		return dessertCals;
	}
	
	/**
	 * Returns total calories int
	 * 
	 * @return total calories
	 */
	public int getTotalCals()
	{
		return totalCals;
	}
	
	/**
	 * Returns boolean for under calorie count
	 * 
	 * @return under calorie boolean
	 */
	public boolean getUnderCals()
	{
		return underCals;
	}
	
	/**
	 * Checks of total calorie count is under limit and underCals to false if not. 
	 * 
	 * @param cals total calories
	 */
	public void isOver(int cals)
	{
		if (cals < 2000) 
		{ 
			underCals = true;
		}
	}
}
