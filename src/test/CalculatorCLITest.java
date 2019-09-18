package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import calculator.CalculatorCLI;

public class CalculatorCLITest {
	
	private CalculatorCLI calculatorCli;
	
	@Before 
	public void setup() {
		calculatorCli = new CalculatorCLI();
	}

	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_1() {
		
		int result = calculatorCli.familyOneCalc(5, 6);
		int expected = 15; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_2() {
		
		int result = calculatorCli.familyOneCalc(5, 7);
		int expected = 30; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_first_and_end_in_first_pay_range_3() {
		
		int result = calculatorCli.familyOneCalc(5,11);
		int expected = 90; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_1() {
		int result = calculatorCli.familyOneCalc(10, 12);
		int expected = 35; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_2() {
		int result = calculatorCli.familyOneCalc(5, 4);
		int expected = 190; 
		Assert.assertEquals(expected, result);
	}
	
	@Test 
	public void family_one_calc_start_in_first_end_in_second_pay_range_3() {
		int result = calculatorCli.familyOneCalc(8, 2);
		int expected = 105; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_start_and_end_in_second_pay_range_1() {
		int result = calculatorCli.familyOneCalc(11, 12);
		int expected = 20; 
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void family_one_calc_start_and_end_in_second_pay_range_2() {
		int result = calculatorCli.familyOneCalc(11, 4);
		int expected = 100; 
		Assert.assertEquals(expected, result);
	}
	
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
	@Test
	public void family_two_calc_start_in_first_end_in_second_1() {
		int result = CalculatorCLI.familyTwoCalc(9,11);
		int expected = 20; 
		Assert.assertEquals(expected, result);
	}
	

}
