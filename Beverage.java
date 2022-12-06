/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Something you can drink that is not water
 * Due: 12/05/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
abstract public class Beverage {
	private String name;
	private Type type;
	private Size size;
	public final double BASE_PRICE = 2.0, EXTRA_PRICE = 1.0;
	public Beverage(String name, Type type, Size size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	public double calcPrice() {
		double price= BASE_PRICE;
		if (this.getSize() == size.MEDIUM)
			price += EXTRA_PRICE;
		else if (this.getSize() == size.LARGE)
			price += 2 * EXTRA_PRICE;
		return price;
	}
	
	public String toString() {
		return "name: " + this.name + " size: " + this.size;
	}
	
	public boolean equals(Beverage otherBev) {
		return this.name == otherBev.name && 
				this.type == otherBev.type &&
				this.size == otherBev.size;
	}
	
	public String getName() {
		return this.name;
	}
	public Type getType() {
		return this.type;
	}
	public Size getSize() {
		return this.size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setSize(Size size) {
		this.size = size;
	}
}
