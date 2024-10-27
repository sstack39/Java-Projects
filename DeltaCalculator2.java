package cop2250.spring24.week4.stack;
//Sean Stack SPC ID#2511132

import java.util.Scanner;

public class DeltaCalculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a starting Date: mm-dd-yyyy ==> ");
        String startDate = scanner.nextLine();
        System.out.print("Enter a ending Date: mm-dd-yyyy ==> ");
        String endDate = scanner.nextLine();
        
        int days = getNumberOfDays(startDate, endDate);
        System.out.println("days is: " + (days));
        
        scanner.close();
    }
    
    private static int getNumberOfDays(String start, String end) {
    	//Initializing string date for starting date
    	String start_date = ""; 
        String start_month = "";
        String start_year = "";
       
        for (int i = 0; i < start.length(); i++ ) {
        if(i < 2){
          //taking first two digits
          start_month += start.charAt(i);
        }
        if(i < 5 && i >= 3){
          //taking months which are at position 3,4
          start_date += start.charAt(i);
        }
        if(i > 5){
          //taking year
          start_year += start.charAt(i);
        }
      }

         int sparse_month = Integer.parseInt(start_month);
         int sparse_date = Integer.parseInt(start_date);
         int sparse_year = Integer.parseInt(start_year);

        //Initializing ending date month and year
        String end_date = "";
        String end_month = "";
        String end_year = "";

        for (int i = 0; i < end.length(); i++) {
        if(i < 2){
          end_month += end.charAt(i);//taking first two digits
        }
        if(i < 5 && i >= 3){
          end_date += end.charAt(i);//taking months which are at position 3,4
        }
        if(i > 5){
          end_year += end.charAt(i);//taking year
        }
      }

         int eparse_month = Integer.parseInt(end_month);
         int eparse_date = Integer.parseInt(end_date);
         int eparse_year = Integer.parseInt(end_year);

         if(sparse_year == eparse_year){//if year is same
             if(sparse_month == eparse_month){//if months are same
                 return (eparse_date - sparse_date);//subtract date and returning value
             }
             else{
                 int sum = daysInMonth(sparse_month, sparse_year) - sparse_date; //Initializing the sum ,which store number of days remaining in the month
                 for (int re = sparse_month + 1; re < eparse_month; re++) { //calculating number of days between the months remaining
                     sum += daysInMonth(re,sparse_year); //adding the days in months in between the two months
                 }
                 sum = sum + eparse_date; //adding the remaining days in last month
                 return sum; //returning the total number of days
             }
         }
         else if(eparse_year > sparse_year){
                 int sum = daysInMonth(sparse_month, sparse_year) - sparse_date; //calculating number of days remaining in the month
                 for (int x = sparse_month + 1; x <= 12; x++) {
                     sum += daysInMonth(x,sparse_year); //number of days remaining in the months between starting and the last month
                 }
                 for (int y = 1;y < eparse_month; y++) {
                     sum += daysInMonth(y,eparse_year); //adding number of days from jan to the before ending month
                 }
                 sum += eparse_date; //adding the number of days in the ending_date_month
                 return sum;
         }
         return 0; //if date ending date is smaller than starting date
     }

     private static boolean isLeapYear(int x){//checking whether the month is leap year
         if(x % 4 == 0 && x % 100 == 0 && x % 400 == 0){
             return true;//if the year is divisible by 4 and 100 and 400 return true
         }
         else if (x % 4 == 0 && x % 100 != 0) {
             return true;//if the year is divisible by 4 and not divisible by 100 return true;
         }
         else if (x % 4 != 0) {
             return false;//if year is not divisible by 4 return false
         }
         else if (x % 4 == 0 && x % 100 == 0 && x % 400 != 0) {
             return false;//if year is divisible by 4 and 100 but not by 400 then return false
         }

         return false;//if no case works return false
     }

     private static int daysInMonth(int month,int year){
         if(month == 1){
             return 31;//taking input of month and returning number of days in the month
         }
         else if (month == 2) {
             if(isLeapYear(year)){//checking if it is a leap year
                 return 29;//if true return number if days as 29
             }
             else{
                 return 28;//if it is not a leap year return number of days as 28
             }
         }
         else if (month == 3) {
             return 31;//similarly returning number of days for the month number
         }
         else if (month == 4) {
             return 30;
         }
         else if (month == 5) {
             return 31;
         }
         else if (month == 6) {
             return 30;
         }
         else if (month == 7) {
             return 31;
         }
         else if (month == 8) {
             return 31;
         }
         else if (month == 9) {
             return 30;
         }
         else if (month == 10) {
             return 31;
         }
         else if (month == 11) {
             return 30;
         }
         else if (month == 12) {
             return 31;
         }

         return 0;//if month number is incorrect
     }

  }