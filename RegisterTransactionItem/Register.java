
package cop2250.spring23.week7.stack;

import java.util.Scanner;



public class Register
{
	static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
		System.out.println("SPC Register System");
		Transaction sale = new Transaction();

		boolean stop = false;
		do {
			
			System.out.println();
			System.out.println("1. Add Soda");
			System.out.println("2. Add Chips");
			System.out.println("3. Add Beer");
			System.out.println("4. Add Magazine");
			System.out.println("5. Pay");
			System.out.println("6. Void");
			System.out.println();
			System.out.print("Enter Choice ==> ");
			
			int choice  = input.nextInt();
			input.nextLine();  // needed to consume leftover \n from nextInt()

			Item item;
			if (choice == 1) {
				item = new Item("Soda", .99, getQty(),false);
				sale.add(item);
			}
			else if (choice == 2) {
				item = new Item("Chips", 1.99,  getQty(),false);
				sale.add(item);
			}
			else if (choice == 3) {
				item = new Item("Beer", 5.99,  getQty());
				sale.add(item);
			}
			else if (choice == 4) {
				item = new Item("Magazine", 9.99,  getQty());
				sale.add(item);
			}
			else if (choice == 5) {
			     System.out.println( sale.getReceipt() ) ;
			     stop = true;
			}
			else if (choice == 6) {
				stop = true;
			}
			
		} while (stop == false);
		
		System.out.println("All done!");
    }
   
    public static int getQty() {
    	System.out.print("Enter Quantity ==> ");
		int qty  = input.nextInt();
		return qty;
    }
}
