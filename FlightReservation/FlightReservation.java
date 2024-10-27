package cop2250.spring24.week6.stack;
//Sean Stack SPC ID#2511132


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FlightReservation {
    private String flightNumber; // Represents the flight number
    private int numberOfSeats; // Represents the total number of seats in the flight
    private String[] seats; // Represents the array of seats
    private ArrayList<String> waitlist; // Represents the waitlist of passengers

    public FlightReservation(String flightNumber, int numberOfSeats) {
        this.flightNumber = flightNumber;
        this.numberOfSeats = numberOfSeats;
        this.seats = new String[numberOfSeats]; // Initialize the seats array with the specified number of seats
        Arrays.fill(seats, "AVAIL"); // Fill the seats array with "AVAIL" to indicate availability
        this.waitlist = new ArrayList<>(); // Initialize the waitlist
    }

    public int reserve(String name) {
        for (int i = 0; i < numberOfSeats; i++) {
            if (seats[i].equals("AVAIL")) { // Check if the seat is available
                seats[i] = name; // Reserve the seat for the passenger
                return i + 1; // Return the seat number
            }
        }
        waitlist.add(name); // Add the passenger to the waitlist
        return 0; // Return 0 to indicate that no seat is available
    }

    public boolean cancel(String name) {
        for (int i = 0; i < numberOfSeats; i++) {
            if (seats[i].equals(name)) { // Check if the passenger has a reserved seat
                seats[i] = "AVAIL"; // Cancel the reservation for the passenger
                if (!waitlist.isEmpty()) { // Check if there are passengers in the waitlist
                    String firstPersonOnWaitlist = waitlist.remove(0); // Get the first person on the waitlist
                    seats[i] = firstPersonOnWaitlist; // Reserve the seat for the first person on the waitlist
                }
                return true; // Return true to indicate successful cancellation
            }
        }
        if (waitlist.contains(name)) { // Check if the passenger is in the waitlist
            waitlist.remove(name); // Remove the passenger from the waitlist
            return true; // Return true to indicate successful cancellation from the waitlist
        }
        return false; // Return false to indicate that the passenger was not found
    }

    public ArrayList<String> getWaitList() {
        return waitlist; // Return the waitlist of passengers
    }

    public String[] getSeats() {
        return seats; // Return the array of seats
    }

    public int getNumberOfPassengers() {
        int count = 0;
        for (String seat : seats) {
            if (!seat.equals("AVAIL")) { // Check if the seat is not available
                count++; // Increment the passenger count
            }
        }
        return count; // Return the number of passengers
    }

    public int getAvailableSeats() {
        return numberOfSeats - getNumberOfPassengers(); // Return the number of available seats
    }

    public String getFlightNumber() {
        return flightNumber; // Return the flight number
    }
}