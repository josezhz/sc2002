package tut3p1;

import java.util.Scanner;

public class VendingMachine {
	// constructor
	VendingMachine() {

	}

	// get the drink selection, and return the cost of the drink
	public double selectDrink() {
		Scanner sc = new Scanner(System.in);
		int drinkSelection;
		double drinkCost = 0;
		System.out.println("====== Vending Machine ======");
		System.out.println("|1. Buy Beer ($3.00)        |");
		System.out.println("|2. Buy Coke ($1.00)        |");
		System.out.println("|3. Buy Green Tea ($5.00)   |");
		System.out.println("=============================");
		do {
			System.out.println("Please enter selection:");
			drinkSelection = sc.nextInt();
		} while (drinkSelection < 1 && 3 < drinkSelection);
		if (drinkSelection == 1)
			drinkCost = 3.00;
		else if (drinkSelection == 2)
			drinkCost = 1.00;
		else if (drinkSelection == 3)
			drinkCost = 5.00;
		return drinkCost;
	}

	// insert the coins and returns the amount inserted
	public double insertCoins(double drinkCost) {
		double balance = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert coins:");
		System.out.println("========== Coins Input ===========");
		System.out.println("|Enter 'Q' for ten cents input   |");
		System.out.println("|Enter 'T' for twenty cents input|");
		System.out.println("|Enter 'F' for fifty cents input |");
		System.out.println("|Enter 'N' for a dollar input    |");
		System.out.println("==================================");
		do {
			char coin = sc.next().charAt(0);
			switch (coin) {
			case 'Q':
			case 'q':
				balance += 0.10;
				break;
			case 'T':
			case 't':
				balance += 0.20;
				break;
			case 'F':
			case 'f':
				balance += 0.50;
				break;
			case 'N':
			case 'n':
				balance += 1.00;
				break;
			}
			System.out.printf("Balance: $%.2f\n", balance);
		} while (balance < drinkCost);
		return balance;
	}

	// check the change and print the change on screen
	public void checkChange(double balance, double drinkCost) {
		double change = 0;
		if (balance > drinkCost) {
			change = balance - drinkCost;
			System.out.printf("Change: $%.2f\n", change);
		}
	}

	// print the receipt and collect the drink
	public void printReceipt() {
		System.out.println("Please collect your drink\nThank You!");
	}
}
