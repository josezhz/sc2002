package lab2;

import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				mulTest();
				break;
			case 2:
				Scanner sc1 = new Scanner(System.in);
				System.out.print("numerator = ");
				int m1 = sc1.nextInt();
				Scanner sc2 = new Scanner(System.in);
				System.out.print("denominator = ");
				int n1 = sc2.nextInt();
				System.out.println(m1 + "/" + n1 + " = " + divide(m1, n1));
				break;
			case 3:
				Scanner sc3 = new Scanner(System.in);
				System.out.print("numerator = ");
				int m2 = sc3.nextInt();
				Scanner sc4 = new Scanner(System.in);
				System.out.print("denominator = ");
				int n2 = sc4.nextInt();
				System.out.println(m2 + " % " + n2 + " = " + modulus(m2, n2));
				break;
			case 4:
				Scanner sc5 = new Scanner(System.in);
				System.out.print("n = ");
				int n3 = sc5.nextInt();
				System.out.println("n : " + n3 + " - count = " + countDigits(n3));
				break;
			case 5:
				Scanner sc6 = new Scanner(System.in);
				System.out.print("n : ");
				int n4 = sc6.nextInt();
				Scanner sc7 = new Scanner(System.in);
				System.out.print("digit : ");
				int digit = sc7.nextInt();
				System.out.println("position = " + position(n4, digit));
				break;
			case 6:
				Scanner sc8 = new Scanner(System.in);
				System.out.print("n : ");
				long n5 = sc8.nextInt();
				System.out.println("oddDigits = " + (n5 < 0 ? "Error input!!" : extractOddDigits(n5)));
				break;
			case 7:
				System.out.println("Program terminating...");
			}
		} while (choice < 7);
	}

	public static void mulTest() {
		int numOfCorrectAns = 0;
		for (int i = 0; i < 5; i++) {
			int int1 = (int) (Math.random() * 9) + 1;
			int int2 = (int) (Math.random() * 9) + 1;
			Scanner sc = new Scanner(System.in);
			System.out.print("How much is " + int1 + " times " + int2 + "? ");
			int ans = sc.nextInt();
			if (ans == int1 * int2) {
				numOfCorrectAns++;
			}
		}
		if (numOfCorrectAns == 1) {
			System.out.println("1 answer out of 5 is correct");
		} else {
			System.out.println(numOfCorrectAns + " answers out of 5 are correct");
		}
	}

	public static int divide(int m, int n) {
		int numerator = m;
		int result = 0;
		while (numerator >= n) {
			numerator -= n;
			result++;
		}
		return result;
	}

	public static int modulus(int m, int n) {
		int numerator = m;
		while (numerator >= n) {
			numerator -= n;
		}
		return numerator;
	}

	public static int countDigits(int n) {
		return (int) (Math.log(n) / Math.log(10) + 1);
	}

	public static int position(int n, int digit) {
		String n_string = Integer.toString(n);
		int indexOfDigit = n_string.lastIndexOf(Integer.toString(digit));
		int position = indexOfDigit;
		if (position != -1) {
			position = n_string.length() - indexOfDigit;
		}
		return position;
	}

	public static long extractOddDigits(long n) {
		String n_string = Long.toString(n);
		String oddDigits = "";
		for (int i = 0; i < n_string.length(); i++) {
			int digit = Character.getNumericValue(n_string.charAt(i));
			if (digit % 2 == 1) {
				oddDigits += Integer.toString(digit);
			}
		}
		if (oddDigits == "") {
			return -1;
		} else {
			return Long.parseLong(oddDigits);
		}
	}

}
