/*
 * Author: Saif Uddin Mahmud
 * Date: March 27, 2015
 */


package template.main;

public class VeggieHoagie extends Hoagie {

	String[] vegetablesUsed = { "Lattuce", "Tomatoes", "Onions", "Sweet Peppers"};
	String[] condimentsUsed = { "Oil", "Vinegar"};

	
	@Override
	boolean customerWantsMeat() {
		return false;
	}
	
	@Override
	boolean customerWantsCheese() {
		return false;
	}
	
	public void cutBun(){
		System.out.println("The Hoagie is Cut.");
	}


	@Override
	void addMeat() { }


	@Override
	void addCheese() { }


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