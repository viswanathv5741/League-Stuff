package abstract_classes.farm;

public class Cow extends Animal{
	public Cow(String name) {
		super(name);
	}

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return "moooooo";
	}
}
