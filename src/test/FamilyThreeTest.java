package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculator.FamilyThree;


public class FamilyThreeTest {
	
	private FamilyThree familyThree; 
	
	@Before 
	public void setup() {
		familyThree = new FamilyThree();
	}
	
	@Test 
	public void start_and_end_in_first_pay_range() {
		int result = familyThree.firstPayCalc(5, 6);
		int expected = 21; 
		
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void start_in_first_and_end_in_second() {
		int result = familyThree.secondPayCalc(8, 10);
		int expected = 36;
		
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void start_and_end_in_third_pay_range() {
		int result = familyThree.thirdPayCalc(10, 3);
		int expected = 15; 
		Assert.assertEquals(expected, result);
	}

}
