package nicebank;

public class Checkout {
	private Integer runningTotal = 0;
	private Inventory inventory;
	
	public Checkout (Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void add(Integer itemCount, String itemName) {
		try {
			runningTotal += itemCount * inventory.priceOf(itemName);
		} catch (ItemNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Integer total() {
		return runningTotal;
	}

}
