package calculator;

public class FamilyOne {
	
	private int firstRate; 
	private int secondRate; 
	
	
	public FamilyOne(int firstRate, int secondRate) {
		super();
		this.firstRate = 15;
		this.secondRate = 20;
	}

	public int firstPayCalc(int startTime, int endTime) {
		int payment = (endTime - startTime)*firstRate;
		return payment; 
	}
	
	
	public int secondPayCalc(int startTime, int endTime) {
		int payment = 0; 
		return payment; 
	}
	

}
