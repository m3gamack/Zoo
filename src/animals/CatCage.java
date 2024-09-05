package animals;

public class CatCage extends Cage {

	private static final String TIGER = "Tiger";
	private static final String LION = "Lion";

	
	
	public boolean doesAnimalBelong(Animal animal) {
		if(animal == null) {
			return false;
		}
		
		if(animal.getType().equals(TIGER) || animal.getType().equals(LION)){
			return true;
		}
		System.out.println("Attempted to put a " + animal.getType() + " in a cat cage. Action not permitted");
		return false;
	}


	public Animal get(String name) {
			for(Animal catAnimal : this.list) {
				//catAnimal is my declared variable within my (for) loop
				if(catAnimal.name.equals(name)) {
					return catAnimal;
				}
			}
			System.out.println(name + " is not in this cage.");
			return null;

		}
		
	
}
	 
	
	
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		

}
*/