        package cop2250.spring24.week5.stack;
        //Sean Stack SPC ID#2511132

        import java.util.Scanner;
        import java.util.Arrays;
        import java.io.InputStream;
        import java.util.ArrayList;
        import java.util.Random;
        import java.util.Collections;
        import java.util.List;

        public class SlotMachine {

          public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner i = Scanner(System.in);
            System.out.println("Enter dollar amount to play ==> ");

            int balance;
            int newBalance = 0;
            balance = sc.nextInt();
            String userInput = "";




            do {
              String[] arr = {"Apple", "Orange", "Banana", "Cherry"};
              Random r = new Random();
              int slot1 = r.nextInt(arr.length);
              int slot2 = r.nextInt(arr.length);
              int slot3 = r.nextInt(arr.length);
              int slot4 = r.nextInt(arr.length);

              System.out.println(arr[slot1] + "  " + arr[slot2] + "  " + arr[slot3] + "  " + arr[slot4]);


              if(slot1 == slot2 && slot2 == slot3 && slot3 == slot4){
                System.out.println("<< You matched 4! That's $10 >>");
                newBalance = balance + 10;
                System.out.println("");
                System.out.println("Balance: $" + newBalance);
                userInput = sc.nextLine();
                if (userInput.equalsIgnoreCase("quit")) {
                  System.out.println("Play Again (P) or Quit (Q): ");
                  if(sc.nextLine().equals("q")) {
                    System.out.println("Thanks for playing! Cash Balance is $" + newBalance);
                    break;
                  }
                }
              else if(slot1 == slot2 && slot1 == slot3 ||slot3 == slot4 && slot2 == slot3 || slot1 == slot4){
                System.out.println("<< You matched 3! That's $2 >>");
                newBalance = balance + 2;
                System.out.println("");
                System.out.println("Balance: $" + newBalance);
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("quit")) {
                  System.out.println("Play Again (P) or Quit (Q): ");
                  if (sc.nextLine().equals("q")) {
                    System.out.println("Thanks for playing! Cash Balance is $" + newBalance);
                    break;
                  }
                }
              else {
                System.out.println("<< Not a winner this time >>");
                newBalance = balance - 1;
                System.out.println("");
                System.out.println("Balance: $" + newBalance);
                userInput = sc.nextLine();
              System.out.println("Play Again (P) or Quit (Q): ");
                if(userInput.equalsIgnoreCase("quit")) {
                  if (sc.nextLine().equals("q")) {
                    System.out.println("Thanks for playing! Cash Balance is $" + newBalance);
                    break;
                  }
                else {
                  continue;
                  }
                }

            }
            } while(balance != 0) {
            }
            }

          private static Scanner Scanner(InputStream in) {
            return null;
          }
        }

