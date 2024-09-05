package animals;

public class Shark extends Animal {

	public Shark(String name, String diet, double weight) {
		super(name, diet, weight);
	}
	
	int eatCount = 0;
	
	public void feed() {
		
		System.out.println(name+ " is eating Shark Fish Bait.");
		eatCount++;	
			
		}
	

	void poop() {
		return;
	}

	void getPoop() {
		
	}

	void getFed() {
		
	}

	
	String getType() {
		
		return this.getClass().getSimpleName();
	}

	String getDetails() {
		
		return null;
	}

}
