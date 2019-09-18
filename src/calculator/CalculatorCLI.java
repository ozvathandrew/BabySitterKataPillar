package calculator;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class CalculatorCLI {
	

	public static void main(String[] args) {
//		CalculatorCLI application = new CalculatorCLI();
//		application.handleFamilyChoice();
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String userChoice = familyChoice(); 
		int timeIn = startTime();
		int timeOut = endTime();
		int payment = handleFamilyChoice(userChoice, timeIn, timeOut);
		
//		out.println(payment); 
//		
		printPayment(payment);
	
	}
	
	public static String familyChoice() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out); 
		
		out.println("Please Select Which Family You're Babysitting For");
		out.println("1) Family 1");
		out.println("2) Family 2");
		out.println("3) Family 3");
		out.flush();
		String userChoice = in.nextLine();
		return userChoice;
		
	}
	
	public static int startTime() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out); 
		
		out.println("What time did you start?");
		out.flush();
		int startTime = Integer.parseInt(in.nextLine());
		return startTime;
	}
	
	public static int endTime() {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out); 
		
		out.println("What time did you leave?");
		out.flush();
		int endTime = Integer.parseInt(in.nextLine());
		return endTime;
	}
	
	public static void printPayment(int payment) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		out.print("Your Expected Payment is $" + payment);
		out.flush();
	}
		
	public static int handleFamilyChoice(String userChoice, int startTime, int endTime) {
		
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out); 
	
		int payment = 0;
		
			if(userChoice.equals("1")) {
				payment = familyOneCalc(startTime, endTime);
				
			} else if (userChoice.equals("2")) {
				payment = familyTwoCalc(startTime, endTime);
				
			} else if(userChoice.equals("3")) {
				payment = familyThreeCalc(startTime, endTime);
				
			}
			
			return payment;			
		}
	
	public static int familyOneCalc(int startTime, int endTime) {
		
	
			FamilyOne familyOne = new FamilyOne();
			int payment = 0; 
			
			if(startTime >= 5 && startTime < 11 && endTime > 5 && endTime <= 11 && startTime < endTime) {
				payment = familyOne.firstPayCalc(startTime, endTime);
				
			} else if ((startTime >= 5 && startTime < 11) && (endTime == 12 || endTime <= 4)) {
				 payment = familyOne.secondPayCalc(startTime, endTime);
				
			} else if ((startTime >= 11 || startTime < 4) && (endTime == 12 || endTime <= 4)) {
				payment =  familyOne.thirdPaymentCalc(startTime, endTime);
				
			}
			return payment;	
		}
	
	public static int familyTwoCalc(int startTime, int endTime) {
		int payment = 0; 
		
		FamilyTwo familyTwo = new FamilyTwo();
		
		if(startTime >= 5 && startTime < 10 && endTime > 5 && endTime <= 10 && startTime < endTime) { // 1 - 1 
			payment = familyTwo.firstPayCalc(startTime, endTime);
		} else if((startTime >= 5 && startTime < 10) && (endTime > 10 && endTime <= 12)) { // 1 - 2 
			payment = familyTwo.secondPayCalc(startTime, endTime);
		} else if((startTime >= 5 && startTime < 10) && (endTime <= 4)) { // 1 - 3 
			payment = familyTwo.thirdPayCalc(startTime, endTime);
		} else if((startTime >= 10 && startTime < 12) && (endTime <= 4)) { // 2 - 3 
			payment = familyTwo.fourthPayCalc(startTime, endTime);
		} else if((startTime == 12 || startTime < 4) && (endTime != 12 && endTime <= 4)){ // 3 - 3 
			payment = familyTwo.fifthPayCalc(startTime, endTime);
		}
		
		return payment; 
	}
	
//	Family Two 
//	Pays $ 12per hour for from 5 to 10 (5 hours) - int firstPayRate
//	Pays $ 8per hour from 10 to 12 (2 hours) - int secondPayRate
//	Pays $ 16per hour from 12 to 4 (4 hours) - int thirdPayRate
	
	public static int familyThreeCalc(int startTime, int endTime) {
		
		FamilyThree familyThree = new FamilyThree(); 
		int payment = 0; 
		
		if(startTime >= 5 && startTime < 9 && endTime > 5 && endTime <= 9 && startTime < endTime) {
			payment = familyThree.firstPayCalc(startTime, endTime); 
		}
		
		return payment; 
	}
	
// Family Three
//Pays $ 21per hour 5 to 9 (4 hours) - int firstPayRate	
//Pays $15per hour 9 to 4 (7 hours) - int secondPayRate 

	
	public Menu createMenu() {
		OutputStream out = System.out;
		InputStream in = System.in;
		Menu menu = new Menu(in,out);
		
		return menu;
	}


}
