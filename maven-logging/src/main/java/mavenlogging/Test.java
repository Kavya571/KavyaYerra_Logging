package mavenlogging;
 



import java.util.Scanner;
import org.apache.logging.log4j.*;

import org.apache.logging.log4j.LogManager;

public class Tester {
	 
	private static Logger LOGGER = LogManager.getLogger(Tester.class);

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		SimpleIntrest calculate = new SimpleIntrest();
		
		Budget budget = new Budget();
		
		
		LOGGER.info("Enter 1 to calculate Simple Interest  or 2 to calculate Compound Interest");
		int option = input.nextInt();
		LOGGER.info("You entered option" + " " + option);
		LOGGER.info("Enter principal , rate , time values");
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		LOGGER.info("Entered values are " + "principal = " + principal + " rate = " + rate + " time = " + time);
		switch(option){
		case 1:
			LOGGER.info("Simple Interest calculated is : " + calculate.computesSI(principal, rate, time));
			break;
		case 2:
			LOGGER.info("Compound Interest calculated is " + calculate.computesCI(principal, rate, time));
			break;
		default:
			LOGGER.info("Invalid option entered");
		}
		
		
		LOGGER.info("Enter Standard of the house to be consturcted");
		LOGGER.info("Enter 1 for normal 2 for medium 3 for high");
		int Standard = input.nextInt();
		LOGGER.info("Entered standard is " + Standard);
		int Automated;
		if( Standard == 3){
			LOGGER.info("Enter 1 for fully automated house else enter 0");
			Automated = input.nextInt();
			LOGGER.info("Entered value is " + Automated);
		}else{
			Automated = 0;
			
		}
		LOGGER.info("Enter the area ");
		double Area = input.nextDouble();
		LOGGER.info("Area entered is " + Area);
		LOGGER.info("Budget calculated is " + budget.ConstructionCost(Area, Standard, Automated));
		
	}
}