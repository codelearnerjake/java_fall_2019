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
	
	public void setEntree(String food)
	{
		entree = food; 
	}
	
	public void setDessert(String sweet)
	{
		dessert = sweet;
	}
	
	public void setEntreeCals(int foodCals)
	{
		entreeCals = foodCals;
	}
	
	public void setDessertCals(int sweetCals)
	{
		dessertCals = sweetCals;
	}
	
	public void setTotalCals() 
	{
		totalCals = dessertCals + entreeCals;
	}
	
	public void SetUnderCals(boolean under)
	{
		underCals = under;
	}
	
	public String getEntree() 
	{
		return entree;
	}
	
	public String getDessert()
	{
		return dessert;
	}
	
	public int getEntreeCals() 
	{
		return entreeCals;
	}
	
	public int getDessertCals()
	{
		return dessertCals;
	}
	
	public int getTotalCals()
	{
		return totalCals;
	}
	
	public boolean getUnderCals()
	{
		return underCals;
	}
	
	public void isOver(int cals)
	{
		if (cals > 2000)
		{ 
			underCals = false;
		}
	}
}

