package cop2250.spring24.week5.stack;
//Sean Stack SPC ID#2511132

import java.util.*;

public class SlotMachine {
    public static void main(String[] args) {
        // The four fruit strings are stored in this array
        String[] fruits = {"Apple", "Orange", "Banana", "Cherry"};
        // The result of each spin will be stored in this ArrayList
        ArrayList<String> spinResult = new ArrayList<>();
        //use a Scanner to read the user's input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter dollar amount to play ==> ");
        //start by reading the user's starting balance
        int balance = scanner.nextInt();
        
        //the main loop of the game, which continues until the user decides to quit
        do {
            // Clear the results of the last spin
            spinResult.clear();
            //use a Random to generate random numbers
            Random random = new Random();
            
            // Generate 4 random fruits
            for (int i = 0; i < 4; i++) {
                int index = random.nextInt(4);
                spinResult.add(fruits[index]);
            }

            // Display the fruits
            System.out.println(String.join(" ", spinResult));

            // Get the highest frequency of any fruit in the spin result
            int maxCount = getMaxFrequency(spinResult, fruits);
            
            // Determine the user's winnings based on the frequency of the most common fruit
            if (maxCount == 3) {
                System.out.println("<< You matched 3!  That's $2 >>");
                balance += 2;
            } else if (maxCount == 4) {
                System.out.println("<< You matched 4!  That's $10 >>");
                balance += 10;
            } else {
                System.out.println("<< Not a winner this time >>");
                balance -= 1;
            }

            // Display the user's current balance
            System.out.println("Balance is: $" + balance);

            // If the user has no money left, the game ends
            if(balance <= 0) {
                System.out.println("Sorry, not enough money to continue.");
                break;
            }

            // Ask the user if they want to continue
            System.out.print("Play Again (P) or Quit (Q)  ");
            char response = scanner.next().toUpperCase().charAt(0);
            
            // If the user decides to quit, the loop ends
            if(response == 'Q') {
                break;
            }

        } while (true);
        
        // Thank the user for playing and display their final balance
        System.out.println("Thanks for playing!  Cash Balance is $" + balance);
        scanner.close();
    }

    // This method counts the frequency of each fruit in the spin result and returns the highest frequency
    private static int getMaxFrequency(ArrayList<String> spinResult, String[] fruits) {
        int maxCount = 0;
        for(String fruit: fruits) {
            int count = Collections.frequency(spinResult, fruit);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}