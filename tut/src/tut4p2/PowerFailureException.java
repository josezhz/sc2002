package tut4p2;

public class PowerFailureException extends Exception {
	public PowerFailureException() {
		super("Power Failure");
	}

	public PowerFailureException(String message) {
		super(message);
	}
}
