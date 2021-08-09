package task2;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<ShoppingList> {
	
	@Override
	public int compare(ShoppingList i1, ShoppingList i2) {
		
		return i1.getItemName().compareTo(i2.getItemName());
	}


}
