package calculator;

import java.io.InputStream;
import java.io.OutputStream;

public class CalculatorCLI {

	public static void main(String[] args) {
		CalculatorCLI application = new CalculatorCLI();
		application.handleFamilyChoice();
	
	}
	
	public void handleFamilyChoice() {
		while(true) {
			Menu menu = createMenu();
			String userChoice = menu.selectFamily();
			int startTime = menu.startTime();
			int endTime = menu.endTime();
			
			if(userChoice.equals("1")) {
				familyOneCalc(startTime, endTime);
				break;
			} else if (userChoice.equals("2")) {
				familyTwoCalc(startTime, endTime);
				break;
			} else if(userChoice.equals("3")) {
				familyThreeCalc(startTime, endTime);
				break;
			} else {
				menu.printMsgToUser("*** Please select a valid choice ***");
			}
		}
	}
	
	public int familyOneCalc(int startTime, int endTime) {
		while(true) {
			Menu menu = createMenu();
			FamilyOne familyOne = new FamilyOne();
			
			if(startTime >= 5 && startTime < 11 && endTime > 5 && endTime <= 11 && startTime < endTime) {
				return familyOne.firstPayCalc(startTime, endTime);
				
			} else if ((startTime >= 5 && startTime < 11) && (endTime == 12 || endTime <= 4)) {
				return familyOne.secondPayCalc(startTime, endTime);
				
			} else if ((startTime >= 11 || startTime < 4) && (endTime == 12 || endTime <= 4)) {
				return familyOne.thirdPaymentCalc(startTime, endTime);
				
			} else {
				menu.printMsgToUser("*** Hours not valid ***");
			}
			return 0;	
		}
	}
	
	public int familyTwoCalc(int startTime, int endTime) {
		int payment = 0; 
		
		return payment; 
	}
	
	public int familyThreeCalc(int startTime, int endTime) {
		int payment = 0; 
		
		return payment; 
	}
	
	
	

	
	public Menu createMenu() {
		OutputStream out = System.out;
		InputStream in = System.in;
		Menu menu = new Menu(in,out);
		
		return menu;
	}


}
