package abstract_classes.farm;

public abstract class Animal {
	private String type; 
	
	abstract String makeNoise();
	
	public Animal(String species) {
		type = species;
	}
	
	public String getType() {
		return type;
	}
}
