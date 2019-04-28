package nicebank;

public class Checkout {
	private Integer runningTotal = 0;
	
	public void add(Integer itemCount, Integer price) {
		runningTotal += itemCount * price;
	}

	public Integer total() {
		return runningTotal;
	}

}
