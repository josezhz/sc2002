package tut4p4;

import java.util.Scanner;

public class CalculatorEx {
	private double result = 0;

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		try {
			System.out.println("Calculator is on");
			cal.doCalculation();
		} catch (UnknownOperatorException e) {
			cal.handleUnknownOpException(e);
		} catch (Exception e) {
			System.out.println("Other Exceptino " + e.getMessage());
		}
		System.out.println("Final result = " + cal.resultValue() + "\nEnd of Program");
	}

	public CalculatorEx() {
		result = 0;
	}

	public double resultValue() {
		return result;
	}

	public void doCalculation() throws ArithmeticException, UnknownOperatorException {
		char op;
		double num;
		boolean done = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("result = " + result);
		while (!done) {
			String nextOpStr = sc.next();
			op = nextOpStr.charAt(0);
			if (op == 'Q' || op == 'q') {
				done = true;
			} else {
				num = sc.nextDouble();
				result = evaluate(op, result, num);
				System.out.println("result " + op + " " + num + " = " + result);
				System.out.println("updated result = " + result);
			}
		}
	}

	public double evaluate(char op, double n1, double n2) throws ArithmeticException, UnknownOperatorException {
		double answer;
		switch (op) {
		case '+':
			answer = n1 + n2;
			break;
		case '-':
			answer = n1 - n2;
			break;
		case '*':
			answer = n1 * n2;
			break;
		case '/':
			answer = n1 / n2;
			break;
		default:
			throw new UnknownOperatorException(op);
		}
		return answer;
	}

	public void handleUnknownOpException(UnknownOperatorException e) {
		System.out.println(e.getMessage());
		System.out.println("Please reenter:");
		try {
			doCalculation();
		} catch (UnknownOperatorException e1) {
			System.out.println(e1.getMessage());
			System.out.println("Try again later");
			System.out.println("End of Program");
		}
	}
}
