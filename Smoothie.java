/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: a smoothie
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
public class Smoothie extends Beverage {
	public final double ADDEDPOWDER_PRICE = 1.5, FRUIT_PRICE = .5;
	int fruits;
	boolean powderAdded;
	public Smoothie(String name, Size size, int fruits, boolean powderAdded) {
		super(name,Type.SMOOTHIE,size);
		this.fruits = fruits;
		this.powderAdded = powderAdded;
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		if (this.powderAdded)
			price += ADDEDPOWDER_PRICE;
		price += fruits * FRUIT_PRICE;
		return price;
	}
	
	public String toString() {
		return super.toString() + " Protein Powder Added: " + this.powderAdded + " Fruits: " + this.fruits;
	}
	
	public boolean equals(Smoothie otherBev) {
		return super.equals(otherBev) && this.fruits == otherBev.getFruits() && this.powderAdded == otherBev.getPowderAdded();
	}
	
	public int getFruits() {
		return this.fruits;
	}
	public boolean getPowderAdded() {
		return this.powderAdded;
	}
	public void setFruits(int fruits) {
		this.fruits = fruits;
	}
	public void setPowderAdded(boolean powderAdded) {
		this.powderAdded = powderAdded;
	}
}
