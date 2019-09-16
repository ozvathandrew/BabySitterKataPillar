package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.FamilyOne;
import org.junit.Assert;

public class FamilyOneTest {
	
	private FamilyOne familyOne; 
	
	@Before
	public void setup() {
		 familyOne = new FamilyOne(15, 20);
	}

	@Test
	public void start_and_end_time_in_first_payrate_results_in_15_an_hour() {
		
		// Act 
		int result = familyOne.firstPayCalc(5,6);
		System.out.print(result);
		int expected = 15; 
		// Assert 
		Assert.assertEquals(expected, result);
		
	}

}
