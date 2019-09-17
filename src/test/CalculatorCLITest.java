package test;

import static org.junit.Assert.*;

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
	public void family_one_calc_first_and_end_in_first_pay_range() {
		
		int result = calculatorCli.familyOneCalc(5, 6);
		int expected = 15; 
		Assert.assertEquals(expected, result);
		
	}

}
