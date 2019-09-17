package calculator;

public class FamilyOne {
	
	private final int firstRate = 15; 
	private final int secondRate = 20;
	private final int firstPayRateBegins = 5;
	private final int firstPayRateEnds = 11; 
	private final int secondPayRateEnds = 4; 
	
	
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
