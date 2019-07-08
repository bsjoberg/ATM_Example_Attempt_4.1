package nicebank;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4919868976381036310L;
	
	public InsufficientFundsException(String reason) {
		this.reason = reason;
	}
	
	private String reason = "";
	
	public String getReason() {
		return reason;
	}

}
