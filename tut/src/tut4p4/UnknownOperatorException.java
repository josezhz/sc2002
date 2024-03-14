package tut4p4;

public class UnknownOperatorException extends Exception {
	public UnknownOperatorException() {
		super("UnkownOperatorException");
	}

	public UnknownOperatorException(char op) {
		super(op + " is an unknownoperator");
	}

	public UnknownOperatorException(String message) {
		super(message);
	}
}
