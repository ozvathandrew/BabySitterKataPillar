package calculator;

public class FamilyTwo {
	
	private final int firstRate = 12; 
	private final int secondRate = 8;
	private final int thirdRate = 16; 
	private final int timeIn = 5;
	private final int beginSecondRate = 10; 
	private final int beginThirdRate = 12;
	private final int timeOut = 4; 
	
		
	public int firstPayCalc(int startTime, int endTime) { // 1 - 1 
		return (endTime - startTime) * firstRate; 
		 
	}
	
	public int secondPayCalc(int startTime, int endTime) { // 1 - 2 
		
		int firstPayRangeHours = beginSecondRate - startTime;
		int secondPayRangeHours = endTime - beginSecondRate; 
		
		return (firstPayRangeHours * firstRate) + (secondPayRangeHours * secondRate);
	}
	
	public int thirdPayCalc(int startTime, int endTime) { // 1 - 3 
		
		int firstPayRangeHours = beginSecondRate - startTime;
		int secondPayRangeHours = beginThirdRate - beginSecondRate;
		int thirdPayRangeHours = endTime; 
		
		return (firstPayRangeHours * firstRate) + (secondPayRangeHours * secondRate ) + (thirdPayRangeHours * thirdRate); 
	}
	
	public int fourthPayCalc(int startTime, int endTime) { // 2 - 3 
		
		int secondPayRangeHours = beginThirdRate - startTime;
		int thirdPayRangeHours = endTime;
		
		return (secondPayRangeHours * secondRate ) + (thirdPayRangeHours * thirdRate);  
	}
	
	public int fifthPayCalc(int startTime, int endTime) { // 3 - 3 
		
		if(startTime == 12) {
			return endTime * thirdRate; 
		} return (endTime - startTime) + thirdRate; 
	}
	
	
	
//	Family Two 
//	Pays $ 12per hour for from 5 to 10 (5 hours) - int firstPayRate
//	Pays $ 8per hour from 10 to 12 (2 hours) - int secondPayRate
//	Pays $ 16per hour from 12 to 4 (4 hours) - int thirdPayRate

	

}
