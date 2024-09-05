package animals;

public abstract class Animal {

		public String name;
		String diet;
		double weight;
		
		Animal(String name, String diet, double weight){
			this.name = name;
			this.diet = diet;
			this.weight = weight;
		}
		
		public abstract void feed();
	
		abstract void poop();
		
		abstract void getPoop();
		
		abstract void getFed();
		
		abstract String getType();

		abstract String getDetails();
		

		
			
	}

	


