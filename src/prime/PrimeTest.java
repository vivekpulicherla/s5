package prime;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		Prime p = new Prime();
		boolean b = p.check(5);
		assertTrue(b);
	}

}
