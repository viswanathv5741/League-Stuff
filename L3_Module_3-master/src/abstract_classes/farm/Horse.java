package abstract_classes.farm;

public class Horse extends Animal{
	public Horse(String name) {
		super(name);
	}

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "nay";
	}
}
