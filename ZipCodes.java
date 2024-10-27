package cop2250.spring24.week3.stack;

import java.util.Scanner;

public class ZipCodes {

	public static void main(String[] args) {
		
		//create a scanner object to read user input
		Scanner input = new Scanner(System.in);
		
		//assign variables with specific digit places to corresponding location in U.S.
		//prompt user to enter a zip code that is +4 digits
		System.out.println("Enter a zip code+4: ");
		
		//using chapter 4 string method to test input length
		String zip = input.nextLine();
		
		//set both test variables as int in order to read as whole number
		//set one as the minimum correct length and the other as scanned length
		int proper = (10);
		
		int ziplength = zip.length();
		
		
		//Utilize if/else statement to verify if zip code entered is good or bad.
		
		if (ziplength == proper) 
			switch (zip.charAt(0)) {
			case 48: System.out.println("Area of the country: Northeastern");
					break;
			case 49: System.out.println("Area of the country: Northeastern");
					break;
			case 50: System.out.println("Area of the country: MidAtlantic");
					break;
			case 51: case 337:
				System.out.println("Area of the country: Southeastern");
				System.out.println("This is SPC's zip code!");
				break;
			case 52: System.out.println("Area of the country: Midwest");
					break;
			case 53: System.out.println("Area of the country: Tornado Alley");
					break;
			case 54: System.out.println("Area of the country: Tornado Alley");
					break;
			case 55: System.out.println("Area of the country: Tornado Alley");
					break;
			case 56: System.out.println("Area of the country: Rockies");
					break;
			case 57: System.out.println("Area of the country: West Coast");
					break;
		}
		else
		{
				System.out.println("Bad Zip code");
			}
		
	}}


