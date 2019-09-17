package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculator.FamilyTwo;


public class FamilyTwoTest {
	
	private FamilyTwo familyTwo; 
	
	@Before 
	public void setup(){
		familyTwo = new FamilyTwo(12, 8, 16); 
	}

	@Test
	public void start_and_end_time_in_first_payrate() {
		
		// Act 
		int result = familyTwo.firstPayCalc(5, 6);
		int expected = 12;
		// Assert 
		Assert.assertEquals(expected, result);
		
	}
	
	@Test 
	public void start_in_first_end_in_second_payrate() {
		
		// Act
		int result = familyTwo.secondPayCalc(9, 11);
		int expected = 20; 
		
		// Assert
		Assert.assertEquals(expected, result);
		
	}

}
