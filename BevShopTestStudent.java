import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
	BevShop bs1 = new BevShop();
	@BeforeEach
	void setUp() throws Exception {
		//BevShop bs1 = new BevShop();
		bs1.startNewOrder(5, Day.MONDAY, "Jim", 24);
		bs1.processAlcoholOrder("Spanish Coffee", Size.MEDIUM);
		bs1.processAlcoholOrder("Spanish Coffee", Size.SMALL);
		bs1.startNewOrder(5, Day.TUESDAY, "Jack", 29);
		bs1.processSmoothieOrder("Snap", Size.SMALL, 2, false);
		bs1.startNewOrder(5, Day.TUESDAY, "John", 12);
		bs1.processCoffeeOrder("snap", Size.LARGE, true, true);
		bs1.processCoffeeOrder("crackle", Size.LARGE, true, false);
		bs1.processCoffeeOrder("pop", Size.MEDIUM, false, true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	public void BevShopTest() {
		BevShop bs2 = new BevShop();
	}
	@Test
	public void isValidTimeTest() {
		assertFalse(bs1.isValidTime(3));
		assertTrue(bs1.isValidTime(13));
	}
	@Test
	public void isMaxFruitTest() {
		assertFalse(bs1.isMaxFruit(3));
		assertTrue(bs1.isMaxFruit(5));
	}
	@Test
	public void getMaxOrderForAlcoholTest() {
		assertTrue(bs1.getMaxOrderForAlcohol() == 3);
	}
	@Test
	public void getNumOfAlcoholDrinkTest() {
		assertTrue(bs1.getNumOfAlcoholDrink() == 2);
	}
	@Test
	public void isValidAgeTest() {
		assertFalse(bs1.isValidAge(19));
		assertTrue(bs1.isValidAge(25));
	}
	@Test
	public void startNewOrderTest() {
		
	}
	@Test
	public void processCoffeeOrderTest() {
		
	}
	@Test
	public void processAlcoholOrderTest() {
		
	}
	@Test
	public void processSmoothieOrderTest() {
		
	}
	@Test
	public void findOrderTest() {
		
	}
	@Test
	public void totalOrderPriceTest() {
		
	}
	@Test
	public void totalOrderPriceFromIndexTest() {
		
	}
	@Test
	public void totalMonthlySaleTest() {
		
	}
	@Test
	public void totalNumOfMonthlyOrdersTest() {
		
	}
	@Test
	public void getCurrentOrderTest() {
		
	}
	@Test
	public void getOrderAtIndexTest() {
		
	}
	@Test
	public void sortOrdersTest() {
		
	}
	@Test
	public void toStringTest() {
		
	}
	@Test
	public void getMaxNumOfFruitsTest() {
		
	}
	@Test
	public void getMinAgeForAlcoholTest() {
		
	}
	@Test
	public void isEligibleForMoreTest() {
		
	}

}
