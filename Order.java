/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: An Order at a beverage shop
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
import java.util.ArrayList;
import java.util.Random;
public class Order implements OrderInterface {
	private int orderNum;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	public int randNum() {
		Random rand = new Random();
		return rand.nextInt(80001) + 10000;
	}
	public Order(int orderNum, int orderTime, Day orderDay, Customer customer, ArrayList<Beverage> beverages) {
		this.orderNum = orderNum;
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = customer;
		this.beverages = beverages;
	}	
	public Order(int orderNum, Day orderDay, Customer customer) {
		this.orderNum = orderNum;
		this.orderTime = 0;
		this.orderDay = orderDay;
		this.customer = customer;
		this.beverages = new ArrayList<Beverage>();
	}	
	public String toString() {
		String output = "Order Number: " + this.orderNum + "Order Time: " + this.orderTime +
				" Order Day: " + this.orderDay + " " + this.customer.toString();
		for (int i = 0; i < this.beverages.size(); i++) {
			output += " " + this.beverages.get(i);
		}
		return output;
	}
	public int compareTo (Order otherOrder) {
		if (this.orderNum > otherOrder.getOrderNum())
			return 1;
		else if (this.orderNum < otherOrder.getOrderNum())
			return -1;
		else
			return 0;
	}
	public int getOrderNum() {
		return this.orderNum;
	}
	public double getOrderTime() {
		return this.orderTime;
	}
	public Day getOrderDay() {
		return this.orderDay;
	}
	public Customer getCustomer() {
		return new Customer(this.customer);
	}
	public ArrayList<Beverage> getBeverages() {
		return this.beverages;
	}	
	public void setOrderNum(int newOrderNum) {
		this.orderNum = newOrderNum;
	}
	public void setOrderTime(int newOrderTime) {
		this.orderTime = newOrderTime;
	}
	public void setOrderDay(Day newOrderDay) {
		this.orderDay = newOrderDay;
	}
	public void setCustomer(Customer newCustomer) {
		this.customer = newCustomer;
	}
	public void setBeverages(ArrayList<Beverage> newBeverages) {
		this.beverages = newBeverages;
	}
	@Override
	public boolean isWeekend() {
		// TODO Auto-generated method stub
		return this.orderDay == Day.SATURDAY || this.orderDay == Day.SUNDAY;
	}
	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		return this.beverages.get(itemNo);
	}
	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		this.beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	public void addNewBeverage(Beverage beverage) {
		this.beverages.add(beverage);
	}
	public void addNewBeverage(String bevName, Size size) {
		this.beverages.add(new Alcohol(bevName, size, this.isWeekend()));
	}
	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		this.beverages.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}
	@Override
	public double calcOrderTotal() {
		double total = 0;
		for (int i =0; i < this.beverages.size(); i++) {
			total += this.beverages.get(i).calcPrice();
		}
		return total;
	}
	@Override
	public int findNumOfBeveType(Type type) {
		int count = 0;
		for (int i =0; i < this.beverages.size(); i++) {
			if (this.beverages.get(i).getType().equals(type))
				count++;
		}
		return count;
	}
	public int getTotalItems() {
		return this.beverages.size();
	}
}
