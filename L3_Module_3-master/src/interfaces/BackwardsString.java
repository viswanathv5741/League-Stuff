package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyTest(String input) {
		// TODO Auto-generated method stub
		String back = "";
		for (int i=input.length()-1; i>=0; i--) {
			back += input.charAt(i);
		}
		return back;
	}

}
