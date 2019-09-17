package calculator;

public class FamilyTwo {
	
	private int firstRate; 
	private int secondRate;
	private int thirdRate; 
	private final int timeIn = 5;
	private final int beginSecondRate = 10; 
	private final int beginThirdRate = 12;
	private final int timeOut = 4; 
	
	
	public FamilyTwo(int firstRate, int secondRate, int thirdRate) {
		super();
		this.firstRate = firstRate;
		this.secondRate = secondRate;
		this.thirdRate = thirdRate; 
	}
	
	public int firstPayCalc(int startTime, int endTime) {
		return (endTime - startTime) * firstRate; 
		 
	}
	
	public int secondPayCalc(int startTime, int endTime) {
		
		int firstPayRangeHours = beginSecondRate - startTime;
		int secondPayRangeHours = beginThirdRate - endTime; 
		
		return (firstPayRangeHours * firstRate) + (secondPayRangeHours * secondRate);
	}
	
//	Family Two 
//	Pays $ 12per hour for from 5 to 10 (5 hours) - int firstPayRate
//	Pays $ 8per hour from 10 to 12 (2 hours) - int secondPayRate
//	Pays $ 16per hour from 12 to 4 (4 hours) - int thirdPayRate

	

}
