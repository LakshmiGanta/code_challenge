package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PrintingBill {
	public static void main(String[] args) {
		
		List<ShoppingList> ShoppingList = new ArrayList<>();
		
		ShoppingList.add(new ShoppingList("Chocolates", 170.22, 2));
		ShoppingList.add(new ShoppingList("Biscuits", 20, 2));
		ShoppingList.add(new ShoppingList("Chocos", 170.22, 2));
		ShoppingList.add(new ShoppingList("Bingo", 170.22, 2));
		ShoppingList.add(new ShoppingList("latee", 170.22, 2));

		Collections.sort(ShoppingList, new ItemNameComparator());
		printBill(ShoppingList);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Grand Total = " + generateBill(ShoppingList));
		System.out.println("---------------------------------------------------------------------------------------------------------");
				
		}
	
	
	public static void printBill(List<ShoppingList> ShoppingList) {
		for (ShoppingList b : ShoppingList) {
			System.out.println(b);
		}
	}
	public static double generateBill(List<ShoppingList> ShoppingList) {
		Double grandTotal=0.00;
		Double billTotal=0.00;
		
		for(ShoppingList S1: ShoppingList) {
			Double total = S1.getTotal();
			billTotal = billTotal+total;			
		}
		grandTotal= billTotal + (0.05*billTotal);
		System.out.println("Bill  Total = " + billTotal);		

		return grandTotal;
	}

}
