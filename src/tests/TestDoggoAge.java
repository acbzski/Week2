package tests;

import static org.junit.Assert.*;
import model.*;
import org.junit.Before;
import org.junit.Test;

public class TestDoggoAge {
	DoggoLogic dl = new DoggoLogic();
	Doggo doggo = new Doggo("Dave", 6, 50, true);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAgeNotNull() {
		assertNotNull(doggo.getAge());
	}
	
	@Test
	public void testHappyBirthday() {
		assertEquals(6, doggo.getAge(), 0);
		int ageOfDave = dl.happyBirthday(doggo);
		assertEquals(7, ageOfDave, 0);
	}

	@Test
	public void testIsSold() {
		assertTrue(dl.isSold(doggo));
	}
}
