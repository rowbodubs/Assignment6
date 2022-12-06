/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Alcoholic beverage
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/

public class Alcohol extends Beverage {
	public final double OFFEREDONWEEKEND_PRICE = .6;
	private boolean offeredOnWeekend;
	public Alcohol(String name, Size size, boolean offeredOnWeekend) {
		super(name,Type.ALCOHOL,size);
		this.offeredOnWeekend = offeredOnWeekend;
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		if (this.offeredOnWeekend)
			price += OFFEREDONWEEKEND_PRICE;
		return price;
	}
	
	public String toString() {
		return super.toString() + " Offered On Weekend: " + this.offeredOnWeekend;
	}
	
	public boolean equals(Alcohol otherBev) {
		return super.equals(otherBev) && this.offeredOnWeekend == otherBev.getOfferedOnWeekend();
	}
	
	public boolean getOfferedOnWeekend() {
		return this.offeredOnWeekend;
	}
	public void setOfferedOnWeekend(boolean offeredOnWeekend) {
		this.offeredOnWeekend = offeredOnWeekend;
	}
}
