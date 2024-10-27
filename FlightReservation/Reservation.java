package cop2250.spring24.week6.stack;
//Sean Stack SPC ID#2511132


import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    public Reservation(String string, int i) {
		
	}

	public static void main(String[] args) {
        // Create a new Reservation object with the flight name "TigerLily" and 10 total seats
        Reservation reservation = new Reservation("SPC-2250", 10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Flight Reservation System");
        
        while (true) {
            System.out.println("\n1. Reserve"); // Display the reservation option
            System.out.println("2. Cancel"); // Display the cancellation option
            System.out.println("3. Show Status"); // Display the status option
            System.out.println("4. Quit"); // Display the quit option
            System.out.print("\nEnter Choice ==> ");
            int choice = scanner.nextInt(); // Read the user's choice
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Customer Name? ");
                    String name = scanner.nextLine(); // Read the customer's name
                    int seatNumber = reservation.reserve(name); // Make a reservation for the customer
                    if (seatNumber == 0) {
                        System.out.println(name + " added to waitlist."); // Display message if customer is added to waitlist
                    } else {
                        System.out.println(name + " assigned to seat number: " + seatNumber); // Display assigned seat number
                    }
                    break;
                case 2:
                    System.out.print("Customer Name? ");
                    String cancelName = scanner.nextLine(); // Read the customer's name for cancellation
                    boolean canceled = reservation.cancel(cancelName); // Cancel the reservation for the customer
                    if (canceled) {
                        System.out.println(cancelName + " has been removed from flight/waitlist"); // Display message if cancellation is successful
                    } else {
                        System.out.println(cancelName + " not found in the seats or waitlist."); // Display message if cancellation fails
                    }
                    break;
                case 3:
                    System.out.println("Seating Chart for Flight " + reservation.getFlightNumber() + "\n"); // Display flight number
                    String[] seats = reservation.getSeats(); // Get the array of seats
                    for (int i = 0; i < seats.length; i++) {
                        String seat = seats[i];
                        System.out.printf("%3d. %12s", (i + 1), seat); // Display seat number and status
                        if ((i + 1) % 2 == 0 || i == seats.length - 1) {
                            System.out.println(); // Print a newline after every two seats or at the end
                        }
                    }
                    System.out.println("\nTotal Passengers: " + reservation.getNumberOfPassengers()); // Display total number of passengers
                    System.out.println(" Available Seats: " + reservation.getAvailableSeats()); // Display number of available seats
                    ArrayList<String> waitlist = reservation.getWaitList(); // Get the waitlist
                    if (waitlist.isEmpty()) {
                        System.out.println("Waitlist is empty"); // Display message if waitlist is empty
                    } else {
                        System.out.println("Waitlist: " + waitlist); // Display the waitlist
                    }
                    break;
                case 4:
                    System.out.println("All done!"); // Display message when user chooses to quit
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Display message for invalid choice
            }
        }
    }

	private ArrayList<String> getWaitList() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getAvailableSeats() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getNumberOfPassengers() {
		// TODO Auto-generated method stub
		return null;
	}

	private String[] getSeats() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getFlightNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean cancel(String cancelName) {
		// TODO Auto-generated method stub
		return false;
	}

	private int reserve(String name) {
		// TODO Auto-generated method stub
		return 0;
	}
}
