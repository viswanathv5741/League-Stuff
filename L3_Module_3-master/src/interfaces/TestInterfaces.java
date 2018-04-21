package interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterfaces {

	@Test
	public void testBackwardsString() {
		SpecialString bs = new BackwardsString("This is a test");
		System.out.println(bs);
		assertEquals("tset a si sihT", bs.toString());
	}
	
	@Test
	public void testMixedCapsString() {
		SpecialString mcs = new MixedCapsString("This is also a test");
		System.out.println(mcs);
		assertEquals("tHiS Is aLsO A TeSt", mcs.toString());
	}

}
