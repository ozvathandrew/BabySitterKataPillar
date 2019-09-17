package calculator;

public class FamilyThree {
	
	private int firstRate; 
	private int secondRate;
	private final int firstPayRateBegins = 5;
	private final int firstPayRateEnds = 9; 
	private final int secondPayRateEnds = 4; 
	
	
	
	public FamilyThree(int firstRate, int secondRate) {
		super();
		this.firstRate = firstRate;
		this.secondRate = secondRate;
	}



	public int firstPayCalc(int startTime, int endTime) {
		return (endTime - startTime)*firstRate;
	}
	
	public int secondPayCalc(int startTime, int endTime) {
		
		int firstPayRangeHours = firstPayRateEnds - startTime; 
		int secondPayRangeHours = 0; 
		
		switch(endTime) {
		case 10: 
			secondPayRangeHours = 1; 
			break; 
		case 11: 
			secondPayRangeHours = 2; 
			break; 
		case 12:
			secondPayRangeHours = 3; 
			break; 
		case 1:
			secondPayRangeHours = 4; 
			break; 
		case 2:
			secondPayRangeHours = 5;
			break; 
		case 3:
			secondPayRangeHours = 6; 
			break; 
		case 4:
			secondPayRangeHours = 7;
			break; 
		}
		return ((firstPayRangeHours) * firstRate) + ((secondPayRangeHours) * secondRate);
	}
	
	public int thirdPayCalc(int startTime, int endTime) {
		
		int hoursBeforeMidnight = 0; 
		int hoursAfterMidnight = 0; 
		
		if(startTime < 12 && endTime != 12) {
			hoursBeforeMidnight = 12 - startTime; 
			hoursAfterMidnight = endTime; 
			return (hoursBeforeMidnight + hoursAfterMidnight) * secondRate; 
		} else if(startTime < 12 && endTime == 12) {
			return (endTime - startTime) * secondRate; 
		} else if(startTime == 12) {
			return endTime * secondRate; 
		} return (endTime - startTime) * secondRate; 
	}

}


//Family Three 
//Pays $ 21per hour 5 to 9 (4 hours) - int firstPayRate	
//Pays $15per hour 9 to 4 (7 hours) - int secondPayRate 
