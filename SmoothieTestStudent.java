import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	Smoothie S1 = new Smoothie("Hotdog Flavored Water", Size.SMALL, 3, true);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void SmoothieTest() {
		Smoothie S2 = new Smoothie("''''''''''", Size.LARGE, 2, true);
	}
	@Test
	public void calcPriceTest() {
		assertTrue(S1.calcPrice() == 5);
	}
	@Test
	public void toStringTest() {
		assertTrue(S1.toString().equals("name: Hotdog Flavored Water size: SMALL Protein Powder Added: true Fruits: 3"));
	}
	@Test
	public void equalsTest() {
		Smoothie S2 = new Smoothie("''''''''''", Size.LARGE, 2, true);
		Smoothie S3 = new Smoothie("Hotdog Flavored Water", Size.SMALL, 3, true);
		assertFalse(S1.equals(S2));
		assertTrue(S1.equals(S3));
	}
	@Test
	public void getFruitsTest() {
		assertTrue(S1.getFruits() == 3);
	}
	@Test
	public void getPowderAddedTest() {
		assertTrue(S1.getPowderAdded() == true);
	}
	@Test
	public void setFruitsTest() {
		S1.setFruits(2);
		assertTrue(S1.getFruits() == 2);
	}
	@Test
	public void setPowderAddedTest() {
		S1.setPowderAdded(false);
		assertTrue(S1.getPowderAdded() == false);
	}

}
