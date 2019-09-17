package calculator;

public class FamilyOne {
	
	private int firstRate; 
	private int secondRate;
	private int firstPayRateBegins = 5;
	private int firstPayRateEnds = 11; 
	private int secondPayRateEnds = 4; 
	
	
	
	public FamilyOne(int firstRate, int secondRate) {
		super();
		this.firstRate = 15;
		this.secondRate = 20;
	}

	public int firstPayCalc(int startTime, int endTime) { // 1 - 1 
		int payment = (endTime - startTime)*firstRate;
		return payment; 
	}
	
	
	public int secondPayCalc(int startTime, int endTime) { // 1 - 2 
		
		int firstPayRangeHours = firstPayRateEnds - startTime; 
		int secondPayRangeHours = 0; 
		
		switch(endTime) {
		case 12: 
			secondPayRangeHours = 1; 
			break; 
		case 1: 
			secondPayRangeHours = 2; 
			break; 
		case 2:
			secondPayRangeHours = 3; 
			break; 
		case 3:
			secondPayRangeHours = 4; 
			break; 
		case 4:
			secondPayRangeHours = 5;
			break; 
		}
		
		int payment = ((firstPayRangeHours) * firstRate) + ((secondPayRangeHours) * secondRate); 
		return payment; 
	}
	
	public int thirdPaymentCalc(int startTime, int endTime) { // 2 - 2 
		
		int payment = 0; 
		
		if(startTime == 12) {
			return payment = endTime * secondRate; 
		} return payment = (endTime - startTime) * secondRate;
	}
	
	
	

	

}
