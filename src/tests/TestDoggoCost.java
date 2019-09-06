package tests;

import static org.junit.Assert.*;
import model.*;
import org.junit.Before;
import org.junit.Test;

public class TestDoggoCost {
	DoggoLogic dl = new DoggoLogic();
	Doggo doggo = new Doggo("Jeffrey");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateTotalCost () {
		doggo.setCost(150);
		double totalCost = dl.calculateTotalCost(doggo);
		assertEquals(160.5, totalCost, 0.00);
	}
	
	@Test
	public void testCalculateTotalTax() {
		doggo.setCost(200);
		double totalTax = dl.calculateTotalTax(doggo);
		assertEquals(14, totalTax, 0.01);
	}

	@Test
	public void testIsSold() {
		doggo.setSold(false);
		assertFalse(dl.isSold(doggo));
	}
}
