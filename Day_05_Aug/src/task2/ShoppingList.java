package task2;

import java.util.Comparator;

public class ShoppingList {
	 
	private String  itemName;
	private double price ;
	private int quantity;
	private	double total;
	
	public ShoppingList() {}
	
	public ShoppingList( String itemName, double price,int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		String itemNames = String.format("%-10s",itemName);
		String cost = String.format("%03.3f", price);
		String quantities = String.format("%02d", quantity);
		this.total = price*quantity;
		return "ShoppingList [itemName = " + itemNames + ", price = " + cost + ", quantity = " + quantities + ", total = " + total+"]";                   

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
