/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A Store that sells beverages
 * Due: 12/05/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	int alcoholOrdered;
	ArrayList<Order> orders;
	public BevShop() {
		this.orders = new ArrayList<Order>();
	}
	public boolean isValidTime(int time) {
		return 8 <= time && time <= 23;
	}
	public boolean isMaxFruit(int numOfFruits) {
		return numOfFruits >= MAX_FRUIT;
	}
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	public int getNumOfAlcoholDrink() {
		int total = 0;
		for (int i = 0; i < this.orders.size(); i++) {
			for (int j = 0; j < this.orders.get(i).getBeverages().size(); j++) {
				if (this.orders.get(i).getBeverages().get(j).getType() == Type.ALCOHOL) {
					total++;
				}
			}
		}
		return total;
	}
	public boolean isValidAge(int age) {
		return age >= MIN_AGE_FOR_ALCOHOL;
	}
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		this.orders.add(new Order(time,day,new Customer(customerName, customerAge)));
	}
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.orders.get(this.orders.size() - 1).addNewBeverage(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	public void processAlcoholOrder(String bevName, Size size) {
		boolean isOfferedOnWeekend = false;
		if (this.getCurrentOrder().getOrderDay() == Day.SATURDAY || this.getCurrentOrder().getOrderDay() == Day.SUNDAY)
			isOfferedOnWeekend = true;
		this.orders.get(this.orders.size() - 1).addNewBeverage(new Alcohol(bevName, size, isOfferedOnWeekend));
	}
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		this.orders.get(this.orders.size() - 1).addNewBeverage(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	public int findOrder(int orderNo) {
		int output = -1;
		for (int i = 0; i < this.orders.size(); i++) {
			if (this.orders.get(i).getOrderNum() == orderNo) {
				output = i;
				break;
			}
		}
		return output;
	}
	public double totalOrderPrice(int orderNo) {
		double total = 0;
		for (int i = 0; i < this.orders.get(this.findOrder(orderNo)).getBeverages().size(); i++) {
			total += this.orders.get(this.findOrder(orderNo)).getBeverages().get(i).calcPrice();
		}
		return total;
	}
	public double totalOrderPriceFromIndex(int index) {
		double total = 0;
		for (int i = 0; i < this.orders.get(index).getBeverages().size(); i++) {
			total += this.orders.get(index).getBeverages().get(i).calcPrice();
		}
		return total;
	}
	public double totalMonthlySale() {
		int total = 0;
		for (int i = 0; i < this.orders.size(); i++) {
			total += this.totalOrderPriceFromIndex(i);
		}
		return total;
	}
	public int totalNumOfMonthlyOrders() {
		return this.orders.size();
	}
	public Order getCurrentOrder() {
		return this.orders.get(this.orders.size() - 1);
	}
	public Order getOrderAtIndex(int index) {
		return this.orders.get(index);
	}
	public void sortOrders() {
		if (this.orders.size() != 0) {
			ArrayList<Order> sortedOrders = null, ordersCopy;
			ordersCopy = new ArrayList(this.orders);
			
			while (ordersCopy.size() > 0) {
				Order smallest = ordersCopy.get(0);
				int smallestIndex = 0;
				for (int i = 1; i < ordersCopy.size(); i++) {
					if (ordersCopy.get(i).compareTo(smallest) == -1) {
						smallest = ordersCopy.get(i);
						smallestIndex = i;
					}
				}
				sortedOrders.add(smallest);
				ordersCopy.remove(smallestIndex);
			}
			this.orders = sortedOrders;
		}
	}
	public String toString() {
		String output = "";
		for (int i = 0; i < this.orders.size(); i++) {
			output += this.orders.get(i).toString() + "\n";
		}
		output += "Total Monthly Sale: " + this.totalMonthlySale();
		return output;
	}
	@Override
	public int getMaxNumOfFruits() {
		// TODO Auto-generated method stub
		return MAX_FRUIT;
	}
	@Override
	public int getMinAgeForAlcohol() {
		// TODO Auto-generated method stub
		return MIN_AGE_FOR_ALCOHOL;
	}
	@Override
	public boolean isEligibleForMore() {
		// TODO Auto-generated method stub
		int total = 0;
		for (int j = 0; j < this.getCurrentOrder().getBeverages().size(); j++) {
			if (this.getCurrentOrder().getBeverages().get(j).getType() == Type.ALCOHOL) {
				total++;
			}
		}
		return total < MAX_ORDER_FOR_ALCOHOL;
	}
}
