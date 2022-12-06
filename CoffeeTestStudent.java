import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
	Coffee C1 = new Coffee("LYNYRD SKYNYRD", Size.LARGE, false ,true);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void CoffeeTest() {
		Coffee C2 = new Coffee("window", Size.MEDIUM, true ,false);
	}
	@Test
	public void calcPriceTest() {
		assertTrue(C1.calcPrice() == 4.5);
	}
	@Test
	public void toStringTest() {
		assertTrue(C1.toString().equals("name: LYNYRD SKYNYRD size: LARGE Extra Shot: false Extra Syrup: true"));
	}
	@Test
	public void equalsTest() {
		Coffee C2 = new Coffee("window", Size.MEDIUM, true ,false);
		Coffee C3 = new Coffee("LYNYRD SKYNYRD", Size.LARGE, false ,true);
		assertFalse(C1.equals(C2));
		assertTrue(C1.equals(C3));
	}
	@Test
	public void getExtraShotTest() {
		assertFalse(C1.getExtraShot());
	}
	@Test
	public void getExtraSyrupTest() {
		assertTrue(C1.extraSyrup);
	}
	@Test
	public void setExtraShotTest() {
		C1.setExtraShot(true);
		assertTrue(C1.getExtraShot());
	}
	@Test
	public void setExtraSyrupTest() {
		C1.setExtraSyrup(false);
		assertFalse(C1.getExtraSyrup());
	}
}
