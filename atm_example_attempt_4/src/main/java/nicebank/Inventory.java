package nicebank;

import java.util.HashMap;

public class Inventory {
	HashMap<String, Integer> inventoryMap = new HashMap<String, Integer>();
	
	public void add(String name, Integer price) {
		inventoryMap.put(name, price);
	}

	public Integer priceOf(String itemName) throws ItemNotFoundException {
		return inventoryMap.get(itemName);
	}

}
