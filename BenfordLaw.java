package cop2250.spring24.week3.stack;

import java.util.Scanner;

public class BenfordLaw {

	public static void main(String[] args) {
		//create scanner object for user input data
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a integer between 1 - 9 ==> ");
		
		//define the 'd' as number entered by user
		double num = input.nextDouble();
		
		//assign math equation for probability to variable
		double probability = Math.log10(1 + (1/num));
		
		// assign new variable 'result' in order to move decimal place to the right twice
		double result = (probability * 100);
		
		//write formatted print statement in order to display result variable as percent.
		System.out.printf("Probability that 1 occurs first is: %.1f%%\n", result);
		
		
	}

	private static double log10(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}