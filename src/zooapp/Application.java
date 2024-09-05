package zooapp;

import java.util.LinkedList;

import animals.*;

public class Application {

	public static void main(String[] args) {

		CatCage catCage = new CatCage();
		Animal t1 = new Tiger("Tony", "Big Cat Kibble", 219);
		Animal l1 = new Lion("Susy", "Big Cat Kibble", 301.2);
		Animal t2 = new Tiger("Tony", "Big Cat Kibble", 219);
		Animal s1 = new Shark("Simon", "Shark Fish Bait", 187.3);

		catCage.put(l1);
		catCage.put(t1);
		catCage.put(t2);
		catCage.put(s1);
		catCage.getCageDetails();
		
		t1.feed();
		
	}

}
