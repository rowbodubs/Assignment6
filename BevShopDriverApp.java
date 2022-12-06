import java.io.PrintStream;
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A Showcase of the Classes involved in a Beverage Shop
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
public class BevShopDriverApp {
	public static void main(String[] args) {
		BevShop bevShop = new BevShop();
		System.out.println("Start a new order");
		bevShop.startNewOrder(8,Day.MONDAY,"John", 23);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.print(bevShop.getCurrentOrder().getCustomer().getName() + ", "
				+ bevShop.getCurrentOrder().getCustomer().getAge() + ", ");
		System.out.println(bevShop.isValidAge(bevShop.getCurrentOrder().getCustomer().getAge()) && bevShop.isEligibleForMore());
		
		System.out.println("Add alcohol drink");
		bevShop.processAlcoholOrder("CorkScrew", Size.MEDIUM);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		bevShop.processAlcoholOrder("CorkScrew", Size.SMALL);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		bevShop.processAlcoholOrder("CorkScrew", Size.LARGE);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Eligible for more alcohol: " + bevShop.isEligibleForMore());
		System.out.println("Add Coffee drink");
		bevShop.processCoffeeOrder("Espresso", Size.LARGE, false, true);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Start a new order");
		bevShop.startNewOrder(8,Day.SUNDAY,"Dave", 19);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.print(bevShop.getCurrentOrder().getCustomer().getName() + ", "
				+ bevShop.getCurrentOrder().getCustomer().getAge());
		System.out.println("Add Smoothie drink");
		bevShop.processSmoothieOrder("King Missile", Size.SMALL, 5, true);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		System.out.println("Add Coffee drink");
		bevShop.processCoffeeOrder("Espresso", Size.LARGE, false, true);
		System.out.println("Total on the order: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Eligible for alcohol: " + bevShop.isValidAge(bevShop.getCurrentOrder().getCustomer().getAge()));
		
		System.out.println(bevShop.getCurrentOrder().calcOrderTotal());
		System.out.println(bevShop.totalMonthlySale());
	}
}
