package animals;

import java.util.*;

public abstract class Cage {
	
	protected List<Animal> list;
	//list is the name of the List collection that holds objects of type/class Animal
	
	public Cage() {
		this.list = new ArrayList<>();
	}
	
	
	// Return the animal that has this name given. If no animal exists with this name, return null
	abstract public Animal get(String name);
	
	abstract public boolean doesAnimalBelong(Animal animal);
	
	public int getTotalAnimalsInCage() {
		return this.list.size();
	}
	
	public void put(Animal animal) {
		if(this.doesAnimalBelong(animal)) {
			this.list.add(animal);
		}
	}
	
	public void release(Animal animal){
		this.list.remove(animal);
	}
	
	public void getCageDetails() {
		for(Animal animal : this.list) {
			System.out.println(animal);
		}
	}
	
	


}
