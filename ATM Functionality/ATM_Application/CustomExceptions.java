package ATM_Application;

public class CustomExceptions extends Exception {

	private static final long serialVersionUID = 1L;

	public CustomExceptions(String message) {
		super(message);
	}

}

class WrongPassword extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongPassword(String message) {
		super(message);
	}

}

class InsufficientFunds extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFunds(String message) {
		super(message);
	}
	
}