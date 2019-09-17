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

}


//Family Three 
//Pays $ 21per hour 5 to 9 (4 hours) - int firstPayRate	
//Pays $15per hour 9 to 4 (7 hours) - int secondPayRate 
