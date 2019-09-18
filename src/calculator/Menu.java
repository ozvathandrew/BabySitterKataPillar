package calculator;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
	
	private PrintWriter out;
	private Scanner in;
	
	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}
	
	public String selectFamily() {
		out.println("Please Select Which Family You're Babysitting For");
		out.println("1) Family 1");
		out.println("2) Family 2");
		out.println("3) Family 3");
		out.flush();
		String userChoice = in.nextLine();
		return userChoice;
	}
	
	public int startTime() {
		out.println("What time did you start?");
		out.flush();
		int startTime = Integer.parseInt(in.nextLine());
		return startTime;
	}
	
	public int endTime() {
		out.println("What time did you leave?");
		out.flush();
		int endTime = Integer.parseInt(in.nextLine());
		return endTime;
	}
	
//	public int printPayment(int payment) {
//		CalculatorCLI calculatorCli = new CalculatorCLI();
//		if(selectFamily().equals("1")) {
//			out.println("You expected payment is: " + payment);
//		}
//		return payment;
//		
//	}
	
	
	public void printMsgToUser(String msg) {
		out.println(msg + "\n");
		out.flush();
	}

}
