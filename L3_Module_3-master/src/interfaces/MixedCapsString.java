package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyTest(String input) {
		// TODO Auto-generated method stub
		String caps = "";
		for (int i=0; i<input.length(); i++) {
			if (i % 2 == 0) {
				if (input.charAt(i) <= 90 && input.charAt(i) >= 65) {
					caps += (char)(input.charAt(i) + 32);
				}
				else {
					caps += input.charAt(i);
				}
			}
			else {
				if (input.charAt(i) == 32) {
					caps += input.charAt(i);
				}
				else {
					int c = input.charAt(i) - 32;
					caps += (char)c;
				}
			}
		}
		return caps;
	}

}
