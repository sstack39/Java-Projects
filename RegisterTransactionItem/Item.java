package cop2250.spring23.week7.stack;

public class Item {

private double unitPrice;

private String description;

private int quantity;

private boolean taxable;

public Item(String des, double uP, int quant) {
	unitPrice = uP;
	description = des;
	quantity = quant;
	taxable = true;
}
public Item(String des, double uP, int quant, boolean tax) {
	unitPrice = uP;
	description = des;
	quantity = quant;
	taxable = tax;
}
public String toString() {
	String result = String.format("%-12s", description);
	StringBuilder sb = new StringBuilder(result);
	String s = "T";
		if(taxable == false) {
			s = "F";
		}
	sb.append(String.format("%8.2f%s", unitPrice * quantity,s));
	if (quantity > 1) {
		sb.append(String.format("\n%d @ %.2f", quantity, unitPrice));
		
	}return sb.toString();
}
public double getCost() {
	return unitPrice * quantity;
}
public boolean isTaxable(){
	return taxable;
}

}
