import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {
	Order O1 = new Order(2069420, Day.TUESDAY, new Customer("Jim Carrey", 65));
	Order O3 = new Order(2069420, 13, Day.TUESDAY, new Customer("Jim Carrey", 65), new ArrayList<Beverage>());
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void randNumTest() {
		assertTrue(10000 <= O1.randNum() && O1.randNum() <= 90000);
	}	
	@Test
	public void OrderTest() {
		
	}	
	@Test
	public void toStringTest() {
		//assertTrue(O1.toString() == );
	}
	@Test
	public void compareToTest () {
		Order O2 = new Order(6942002, Day.MONDAY, new Customer("Slavoj Zizek", 62));
		assertTrue(O1.compareTo(O2) == -1);
	}
	@Test
	public void getOrderNumTest() {
		assertTrue(O1.getOrderNum() == 2069420);
	}
	@Test
	public void getOrderTimeTest() {
		assertTrue(O3.getOrderTime() == 13);
	}
	@Test
	public void getOrderDayTest() {
		assertTrue(O1.getOrderDay() == Day.TUESDAY);
	}
	/*@Test
	public void getCustomerTest() {
		assertTrue(O1.getCustomer().equals(new Customer("Jim Carrey", 65)));
	}*/
	/*@Test
	public void getBeveragesTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		
		O3.addNewBeverage("Alabama", Size.MEDIUM, false, true);
		O3.addNewBeverage("KentCucky", Size.SMALL, 2, true);
		O3.addNewBeverage("West Virginia", Size.LARGE);
		assertTrue(O3.getBeverages().equals(beverageList));
	}*/	
	@Test
	public void setOrderNumTest() {
		O1.setOrderNum(23);
		assertTrue(O1.getOrderNum() == 23);
	}
	@Test
	public void setOrderTimeTest() {
		O1.setOrderTime(23);
		assertTrue(O1.getOrderTime() == 23);
	}
	@Test
	public void setOrderDayTest() {
		O1.setOrderDay(Day.MONDAY);
		assertTrue(O1.getOrderDay().equals(Day.MONDAY));
	}
	/*@Test
	public void setCustomerTest() {
		O1.setCustomer(new Customer("me", 15));
		assertTrue(O1.getCustomer().equals(new Customer("me", 15)));
	}*/
	@Test
	public void setBeveragesTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		O1.setBeverages(beverageList);
		assertTrue(O1.getBeverages().equals(beverageList));
	}
	@Test
	public void isWeekendTest() {
		assertFalse(O1.isWeekend());
	}
	/*@Test
	public void getBeverageTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		O1.setBeverages(beverageList);
		assertTrue(O1.getBeverage(0).equals(new Coffee("Alabama", Size.MEDIUM, false, true)));
		assertTrue(O1.getBeverage(1).equals(new Smoothie("KentCucky", Size.SMALL, 2, true)));
		assertTrue(O1.getBeverage(2).equals(new Alcohol("West Virginia", Size.LARGE, false)));
	}
	/*@Test
	public void addNewBeverageTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		
		O3.addNewBeverage("Alabama", Size.MEDIUM, false, true);
		O3.addNewBeverage("KentCucky", Size.SMALL, 2, true);
		O3.addNewBeverage("West Virginia", Size.LARGE);
		assertTrue(O3.getBeverages().equals(beverageList));
	}*/
	@Test
	public void calcOrderTotalTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		
		O3.addNewBeverage("Alabama", Size.MEDIUM, false, true);
		O3.addNewBeverage("KentCucky", Size.SMALL, 2, true);
		O3.addNewBeverage("West Virginia", Size.LARGE);
		assertTrue(O3.calcOrderTotal() == 6+3+1+1.5+.5);
	}
	/*@Test
	public void findNumOfBeveTypeTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		
		O3.addNewBeverage("Alabama", Size.MEDIUM, false, true);
		O3.addNewBeverage("KentCucky", Size.SMALL, 2, true);
		O3.addNewBeverage("West Virginia", Size.LARGE);
		assertTrue(O1.findNumOfBeveType(Type.ALCOHOL) == 1);
	}
	/*@Test
	public void getTotalItemsTest() {
		ArrayList<Beverage> beverageList = new ArrayList<Beverage>();
		beverageList.add(new Coffee("Alabama", Size.MEDIUM, false, true));
		beverageList.add(new Smoothie("KentCucky", Size.SMALL, 2, true));
		beverageList.add(new Alcohol("West Virginia", Size.LARGE, false));
		
		O3.addNewBeverage("Alabama", Size.MEDIUM, false, true);
		O3.addNewBeverage("KentCucky", Size.SMALL, 2, true);
		O3.addNewBeverage("West Virginia", Size.LARGE);
		assertTrue(O1.getTotalItems() == 3);
	}*/

}
