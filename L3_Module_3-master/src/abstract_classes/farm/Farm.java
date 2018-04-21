package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	private static ArrayList<Animal> animals;
	
	public static void main(String[] args) {
		animals = new ArrayList<Animal>();
		
		animals.add(new Pig("Sally"));
		animals.add(new Pig("Wilber"));
		animals.add(new Cow("Daisy"));
		animals.add(new Horse("Savannah"));
		animals.add(new Horse("Twinkle"));
		animals.add(new Chicken("Hen"));
		
		for (int i=0; i<animals.size(); i++) {
			System.out.println(animals.get(i).getType() + " " + animals.get(i).makeNoise());
		}
	}
}
