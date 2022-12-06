import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {
	Customer C1 = new Customer("Sarah Conner", 66);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void CustomerTest() {
		Customer C2 = new Customer("me", 15);
	}
	@Test
	public void toStringTest() {
		assertTrue(C1.toString().equals("Name: Sarah Conner Age: 66"));
	}
	@Test
	public void getNameTest() {
		assertTrue(C1.getName().equals("Sarah Conner"));
	}
	@Test
	public void setNameTest() {
		C1.setName("James Cameron");
		assertTrue(C1.getName().equals("James Cameron"));
	}
	@Test
	public void getAgeTest() {
		assertTrue(C1.getAge() == 66);
	}
	@Test
	public void setAgeTest() {
		C1.setAge(35);
		assertTrue(C1.getAge() == 35);
	}

}
