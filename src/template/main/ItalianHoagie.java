/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */


package template.main;

public class ItalianHoagie  extends Hoagie{
	
	String[] meatUsed = { "Salami", "Pepperoni", "Capicola ham"};
	String[] cheeseUsed = { "Provolone"};
	String[] vegetablesUsed = { "Lattuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = { "Oil", "Vinegar"};
	
	public void cutBun(){
		System.out.println("The Hoagie is Cut.");
	}


	@Override
	void addMeat() {

		System.out.println("Adding the meat");
		
		for(String meat : meatUsed){
		
			System.out.println(meat + " ");
		}
	}


	@Override
	void addCheese() {

		System.out.println("Adding the cheese");
		
		for(String cheese : cheeseUsed){
		
			System.out.println(cheese + " ");
		}
	}


	@Override
	void addVegetables() {
		
		System.out.println("Adding the vegetables..");
		
		for(String vegetables : vegetablesUsed){
		
			System.out.println(vegetables +  " ");
		}
	}

	@Override
	void addCondiments() {
		
		System.out.println("Adding the condiments");
		
		for(String condiments : condimentsUsed){
		
			System.out.println(condiments + " ");
		}
	}
}
