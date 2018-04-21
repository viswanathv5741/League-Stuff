package abstract_classes.farm;

public class Chicken extends Animal{
	public Chicken(String name) {
		super(name);
	}

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "cluck";
	}
}
