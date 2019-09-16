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
		int expected = 15; 
		// Assert 
		Assert.assertEquals(expected, result);
		
	}
	
	@Test 
	public void starts_in_first_pay_range_ends_in_second_pay_range() {
		
		// Act 
		int result = familyOne.secondPayCalc(10,12);
		int expected = 35; 
		// Assert
		Assert.assertEquals(expected, result);
		
	}

}
