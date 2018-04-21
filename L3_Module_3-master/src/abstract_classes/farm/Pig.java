package abstract_classes.farm;

public class Pig extends Animal{
	public Pig(String name) {
		super(name);
	}

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "oink";
	}
	
	
}
