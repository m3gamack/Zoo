package animals;

public class Tiger extends Animal {

	
	public Tiger(String name, String diet, double weight) {
		super(name, diet, weight);
	}
	
	int counter = 0;
	int eatCount = 0;
	int pooCount = 0;
	
	
	public void feed() {
		counter++;
			
		if(this.counter == 3) {
			System.out.println(name+ " had to poop before eating again.");
			this.poop();
			counter = 0;
			eatCount++;
		}
	
		System.out.println(name+ " is eating Big Cat Kibble.");
		eatCount++;		
	}


	protected void poop() {
		pooCount++;
	}
	
	public void getPoop() {
		System.out.println(this.pooCount);
	}
	
	public void getFed() {
		System.out.println(this.eatCount);
	}
	
	public String getDetails() {
		return this.getClass().getSimpleName() +"/Land Animal";
	}
	
	public String toString() {
		return "Type: " + this.getDetails() + "| Name: " + this.name +  " | Weight: " + this.weight +  "| Diet: " + this.diet +  "| Eat/Poop: " + this.eatCount + "/" + this.pooCount;
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}	
	
	
	
}
