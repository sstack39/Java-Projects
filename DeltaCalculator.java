package cop2250.spring24.week4.stack;
//Sean Stack SPC ID#2511132

//import scanner, date format, and date utilities
import java.util.Scanner;

public class DeltaCalculator {

	public static void main(String[] args) {
		//define the scanner that will read user input data
				Scanner sc = new Scanner(System.in);
				
				//prompt user to enter starting date
				System.out.print("Enter Starting Date: mm-dd-yyyy ==> ");
				
				//assign input reader as a string to be parsed later
				String b = sc.nextLine();
				
				//prompt user to enter an end date
				System.out.print("Enter Ending Date: mm-dd-yyyy ==> ");
				
				//assign input reader as a string to be parsed later
				String a = sc.nextLine();
				
				//create a readable date format
				SimpleDateFormat myFormat = new SimpleDateFormat("MM-dd-yyyy");
				
				int StartDays =  b.charAt(1-2);
				int StartMonth = b.charAt(4-5);
				int StartYear = b.charAt(7-10);
				
				int EndDays = a.charAt(1-2);
				int EndMonth = a.charAt(4-5);
				int EndYear = a.charAt(7-10);
				int LeapIdentifier = (0);
			
				
				System.out.println("days is: " + getNumberOfDays);
				
			//establish a method for calculating the proper difference for both dates entered
		public static int getNumberOfDays(int dateStart, int dateEnd); {
			Date dateBefore = myFormat.parse(b);
			Date dateAfter = myFormat.parse(a);
			long difference = dateAfter.getTime() - dateBefore.getTime();
					
			return getNumberOfDays = (difference / (1000*60*60*24));
		}
			
		public static int isLeapYear(StartYear, EndYear); {
			boolean isLeapYear = ((StartYear % 4 == 0) && (StartYear % 100 != 0) || (StartYear % 400 == 0));
					
			if (isLeapYear) {
				int years = (EndYear - StartYear + 1);
				int LeapIdentifier = (years);
			} else {
				int LeapIdentifier = (0);
			}
		}
			
		public static int daysInMonth(StartMonth,StartYear - EndMonth,EndYear); {
				
		}
		//utilize the do-while loop to perform necessary calculations and introduce method
			

	}

}
