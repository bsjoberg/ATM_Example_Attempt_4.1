package nicebank;

public class Checkout {
	private Integer runningTotal = 0;
	
	public void add(Integer itemCount, Integer bananaPrice) {
		runningTotal += itemCount * bananaPrice;
	}

	public Integer total() {
		return runningTotal;
	}

}
