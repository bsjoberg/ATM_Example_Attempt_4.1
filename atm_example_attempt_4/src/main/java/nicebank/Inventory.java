package nicebank;

import java.util.HashMap;

public class Inventory {
	HashMap<String, Integer> inventoryMap = new HashMap<String, Integer>();
	
	public void add(String name, Integer price) {
		inventoryMap.put(name, price);
	}

	public Integer priceOf(String itemName) throws ItemNotFoundException {
		if (inventoryMap.containsKey(itemName))
			return inventoryMap.get(itemName);
		else
			throw new ItemNotFoundException();
	}
}
