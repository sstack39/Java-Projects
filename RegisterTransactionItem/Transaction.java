package cop2250.spring23.week7.stack;
//Sean Stack SPC ID#2511132

import java.util.ArrayList;

public class Transaction {

private static ArrayList<Item> items = new ArrayList<>();

private double taxRate;
private double tax;
private double total;

public Transaction() {
	taxRate = 0.07;
	tax = 0.0;
	total = 0.0;
}

public void add(Item item) {
	items.add(item);
}
public double getSubtotal() {
	double sub_total = 0;
	for(Item item:items) {
		sub_total += item.getCost();
	}
	return sub_total;
}

public double getTaxableAmount() {
	tax = 0;
	for(Item item:items) {
		if(item.isTaxable()) {
			tax += item.getCost();
		}
	}
	return tax;
}
public String getReceipt() {
	String rec = "";
	rec += "   R E C E I P T\n\n";
	rec += "Item          Amount\n";
	rec += "-------       ------\n";
	for(Item item:items) {
		rec += item.toString();
		rec += "\n";
	}
	rec += "\n";
	rec += String.format("    SubTotal    %.2f\n", getSubtotal());
	rec += String.format("Tax on  %.2f    %.2f\n", getTaxableAmount(), getTaxableAmount() * taxRate);
	rec += String.format("       Total    %.2f\n", getSubtotal()+ getTaxableAmount() * taxRate);
	return rec;
}



}
