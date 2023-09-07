/**
 * Jacey Espinosa - jlespinosa
 * CIS175 - Fall 2023
 * 09/06/2023
 */

package tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.Dog;
import model.DogLogic;

public class TestDogLogic {
	DogLogic dl = new DogLogic();
	Dog dog = new Dog("Max Espinosa", "Golden Retriever", 10);
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void  testRetriever() {
		assertTrue(dl.isRetriever(dog));
	}
	
	@Test
	public void  testName() {
		assertFalse(dl.shortName(dog));
	}
	
	@Test
	public void testDogYears() {
		int doggieYears = dl.calcDogYears(dog);
		assertEquals(70, doggieYears, 0);
	}
	
	
	
	
}
