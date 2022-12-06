import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeverageTestStudent {
	Coffee C1 = new Coffee("LYNYRD SKYNYRD", Size.LARGE, false ,true);
	Smoothie S1 = new Smoothie("Hotdog Flavored Water", Size.SMALL, 3, true);
	Alcohol A1 = new Alcohol("Lizard Wizard", Size.MEDIUM, false);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void BeverageTest() {
		Coffee C2 = new Coffee("window", Size.MEDIUM, true ,false);
		Smoothie S2 = new Smoothie("''''''''''", Size.LARGE, 2, true);
		Alcohol A2 = new Alcohol("Jack & Jill", Size.SMALL, true);
	}
	@Test
	public void calcPriceTest() {
		assertTrue(C1.calcPrice() == 4.5);
		assertTrue(S1.calcPrice() == 5);
		//assertTrue(A1.calcPrice() == 2.6);
	}
	@Test
	public void toStringTest() {
	}
	@Test
	public void equalsTest() {
	}
	@Test
	public void getNameTest() {
	}
	@Test
	public void getTypeTest() {
	}
	@Test
	public void getSizeTest() {
	}
	@Test
	public void setNameTest() {
	}
	@Test
	public void setTypeTest() {
	}
	@Test
	public void setSizeTest() {
	}

}
