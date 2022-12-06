/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Someone who buys from a store
 * Due: 12/05/2022
 * Platform/compiler: Eclpise
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
public class Customer {
	private String name;
	private int age;
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Customer(Customer otherCustomer) {
		this.name = otherCustomer.getName();
		this.age = otherCustomer.getAge();
	}
	public String toString() {
		return "Name: " + this.getName() + " Age: " + this.getAge();
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
