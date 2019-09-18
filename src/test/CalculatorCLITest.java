package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculator.CalculatorCLI;

public class CalculatorCLITest {
	
//	private CalculatorCLI calculatorCli;
//	
//	@Before 
//	public void setup() {
//		calculatorCli = new CalculatorCLI();
//	}
	
	// Family One Calc
	
	// First Calc

	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_1() {
		
		int result = CalculatorCLI.familyOneCalc(5, 6);
		int expected = 15; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_2() {
		
		int result = CalculatorCLI.familyOneCalc(5, 7);
		int expected = 30; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_3() {
		
		int result = CalculatorCLI.familyOneCalc(5,11);
		int expected = 90; 
		Assert.assertEquals(expected, result);
	}
	
	// Second Calc
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_1() {
		int result = CalculatorCLI.familyOneCalc(10, 12);
		int expected = 35; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_2() {
		int result = CalculatorCLI.familyOneCalc(5, 4);
		int expected = 190; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_3() {
		int result = CalculatorCLI.familyOneCalc(8, 2);
		int expected = 105; 
		Assert.assertEquals(expected, result);
	}
	
	// Third Calc
	
	@Test
	public void family_one_calc_start_and_end_in_second_pay_range_1() {
		int result = CalculatorCLI.familyOneCalc(11, 12);
		int expected = 20; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_start_and_end_in_second_pay_range_2() {
		int result = CalculatorCLI.familyOneCalc(11, 4);
		int expected = 100; 
		Assert.assertEquals(expected, result);
	}
	
	// Family Two Calc
	
	// First Calc
	
	@Test
	public void family_two_calc_start_and_end_in_first_pay_range_1() {
		int result = CalculatorCLI.familyTwoCalc(5,6);
		int expected = 12; 
		Assert.assertEquals(expected, result);
	}
	@Test
	public void family_two_calc_start_and_end_in_first_pay_range_2() {
		int result = CalculatorCLI.familyTwoCalc(5,10);
		int expected = 60; 
		Assert.assertEquals(expected, result);
	}
	
	// Second Calc
	
	@Test
	public void family_two_calc_start_in_first_end_in_second_1() {
		int result = CalculatorCLI.familyTwoCalc(9,11);
		int expected = 20; 
		Assert.assertEquals(expected, result);
	}
	@Test
	public void family_two_calc_start_in_first_end_in_second_2() {
		int result = CalculatorCLI.familyTwoCalc(5,12);
		int expected = 76; 
		Assert.assertEquals(expected, result);
	}
	
	// Third Calc
	
	@Test
	public void family_two_calc_start_in_first_end_in_third_1() {
		int result = CalculatorCLI.familyTwoCalc(9,1);
		int expected = 44; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_two_calc_start_in_first_end_in_third_2() {
		int result = CalculatorCLI.familyTwoCalc(5,4);
		int expected = 140; 
		Assert.assertEquals(expected, result);
	}
	
	// Forth Calc
	
	@Test
	public void family_two_calc_start_in_second_end_in_third_1() {
		int result = CalculatorCLI.familyTwoCalc(11,1);
		int expected = 24; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_two_calc_start_in_second_end_in_third_2() {
		int result = CalculatorCLI.familyTwoCalc(10,4);
		int expected = 80; 
		Assert.assertEquals(expected, result);
	}
	
	// Fifth Calc
	
	@Test 
	public void family_two_calc_start_and_end_in_third_1() {
		int result = CalculatorCLI.familyTwoCalc(12,1);
		int expected = 16; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_two_calc_start_and_end_in_third_2() {
		int result = CalculatorCLI.familyTwoCalc(12,4);
		int expected = 64; 
		Assert.assertEquals(expected, result);
	}
	
	

}
