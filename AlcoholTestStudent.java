import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {

	private Alcohol a1 = new Alcohol("King Missile", Size.MEDIUM,true);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAlcohol() {
		Alcohol a2 = new Alcohol("King Gizzard", Size.SMALL,false);
	}
	@Test
	public void testcalcPrice() {
		assertTrue(a1.calcPrice() == 3.6);
	}
	@Test
	public void testtoString() {
		assertTrue(a1.toString().equals("name: King Missile size: MEDIUM Offered On Weekend: true"));
	}
	@Test
	public void testequals() {
		Alcohol a2 = new Alcohol("King Gizzard", Size.SMALL,false);
		Alcohol a3 = new Alcohol("King Missile", Size.MEDIUM,true);
		assertTrue(a2.equals(a1)==false);
		assertTrue(a3.equals(a1)==true);
	}
	@Test
	public void testgetOfferedOnWeekend() {
		assertTrue(a1.getOfferedOnWeekend()==true);
	}
	@Test
	public void testsetOfferedOnWeekend() {
		a1.setOfferedOnWeekend(false);
		assertTrue(a1.getOfferedOnWeekend()==false);
	}

}
