package cop2250.spring24.week1.stack;

//Sean Stack, SPC ID 2511132

//import scanner to read the prompted user input
import java.util.Scanner;

public class TaxiProgram1 {

	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);
		//prompt the user to enter miles for ride share service
		System.out.println("How many miles? ==> ");
		double miles = input.nextDouble();
		//prompt the user to enter a tip percentage
		System.out.println("Tip Percentage ==> ");
		double tip = input.nextDouble();
		//display Summary text
		System.out.println("Summary");
		//display miles input by user
		System.out.println("Miles           " + miles);
		//calculate fare amount
		double fare = miles * (1.9);
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
