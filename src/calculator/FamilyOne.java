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
		return (endTime - startTime)*firstRate;
		 
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
		
		return ((firstPayRangeHours) * firstRate) + ((secondPayRangeHours) * secondRate); 
		
	}
	
	public int thirdPaymentCalc(int startTime, int endTime) { // 2 - 2 
		
		if(startTime == 12) {
			return endTime * secondRate; 
		} return (endTime - startTime) * secondRate;
	}
	
	
	

	

}
