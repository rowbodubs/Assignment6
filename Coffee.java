/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: A cafenated beverage made from coffee beans
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
public class Coffee extends Beverage{
	public final double EXTRASHOT_PRICE = .5;
	public final double EXTRASYRUP_PRICE = .5;
	boolean extraShot, extraSyrup;
	public Coffee(String name, Size size, boolean extraShot, boolean extraSyrup) {
		super(name,Type.COFFEE,size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public double calcPrice() {
		double price = super.calcPrice();
		if (this.extraShot)
			price += EXTRASHOT_PRICE;
		if (this.extraSyrup)
			price += EXTRASYRUP_PRICE;
		return price;
	}
	
	public String toString() {
		return super.toString() + " Extra Shot: " + this.extraShot + " Extra Syrup: " + this.extraSyrup;
	}
	
	public boolean equals(Coffee otherBev) {
		return super.equals(otherBev) && this.extraShot == otherBev.getExtraShot() && this.extraSyrup == otherBev.getExtraSyrup();
	}
	
	public boolean getExtraShot() {
		return this.extraShot;
	}
	public boolean getExtraSyrup() {
		return this.extraSyrup;
	}
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}
	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}
}
