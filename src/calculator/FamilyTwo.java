package calculator;

public class FamilyTwo {
	
	private int firstRate; 
	private int secondRate;
	private int thirdRate; 
	private final int firstPayRateBegins = 5;
	private final int firstPayRateEnds = 11; 
	private final int secondPayRateEnds = 4; 
	
	
	public FamilyTwo(int firstRate, int secondRate, int thirdRate) {
		super();
		this.firstRate = firstRate;
		this.secondRate = secondRate;
		this.thirdRate = thirdRate; 
	}
	
	public int firstPayCalc(int startTime, int endTime) {
		int payment = (endTime - startTime) * 12; 
		return payment; 
	}
	
//	Family Two 
//	Pays $ 12per hour for from 5 to 10 (5 hours) - int firstPayRate
//	Pays $ 8per hour from 10 to 12 (2 hours) - int secondPayRate
//	Pays $ 16per hour from 12 to 4 (4 hours) - int thirdPayRate

	

}
