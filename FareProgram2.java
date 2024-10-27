package cop2250.spring24.week2.stack;

import java.util.Scanner;

//Sean Stack, SPC ID 2511132



public class FareProgram2 {

	public static void main(String[] args) {
		//create a scanner object
				Scanner input = new Scanner(System.in);
				
				//prompt the user to enter miles for ride share service
				System.out.println("How many miles? ==> ");
				double miles = input.nextDouble();
				
				//prompt the user to enter a tip percentage
				System.out.println("Tip Percentage ==> ");
				double tip = input.nextDouble();
				
				//prompt the user to enter the time of day (1-24)
				System.out.println("Enter the time of day (1-24) ==> ");
				int time = input.nextInt();
				
				//create if-else statement to determine new mileage rate multiplier
				
				//declare a new variable; 'multiplier' to represent the new mileage rates
				//as per instructions
				double multiplier = (0.0);
				if (miles >= 20)  {
					multiplier = (1.9);
				} else if(miles >= 15) {
					multiplier = (1.6);
				} else if(miles >= 10) {
					multiplier = (1.3);
				} else if(miles >= 1 || miles <= 9) {
					multiplier = (1.0);
				}
					
				//create if-else statement to determine 'surge factor' multiplier either 2 or 1.5
				//based on the time of day entered by user
				
				//use the logical operators in order to test the user input for a particular 
				//range of numbers designated for a specific output or rate as per instructions
				
				//declare a new variable for the surge factor
				double surge = (1.0);
				if (time == 7 || time == 8 || time == 9 || time == 10) {
					surge = (2.0);
				} else if(time == 16 || time == 17 || time == 18 || time == 19) {
					surge = (1.5);
				} else if(time >= 1 && time <= 6 && time >= 20 && time <= 24) {
					surge = (1.0);
				}
				
				//display Summary text
				System.out.println("Summary");
				
				//display miles input by user
				System.out.println("Miles           " + miles);
				
				//calculate fare amount
				double fare = (miles * multiplier * surge);
				
				//display the calculated fare amount as dollars
				System.out.println("fare..........$ " + fare);
				
				//set the variable for the booking fee
				double booking = (5.0);
				
				//display the booking fee as dollars
				System.out.println("Booking Fee...$ " + booking);
				
				//calculate the tip amount
				double newtip = (tip * 0.01 * fare);
				
				//display the calculated tip amount from user input
				System.out.println("TIP...........$ " + newtip);
				
				//display dashed lines after listing itemized summary
				System.out.println("--------------------");
				
				//calculate total amount owed by customer
				double total = (fare + booking + newtip);
				
				//display total amount
				System.out.println("    Total.....$ " + total);
				

	}

}
