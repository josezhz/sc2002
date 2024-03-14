package tut2p2;

import java.util.Scanner;

public class DiceApp {

	public static void main(String[] args) {
		int totalValue = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press <key> to roll the first dice");
		sc.nextLine();
		Dice dice = new Dice();
		dice.printDiceValue();
		totalValue += dice.getDiceValue();
		System.out.println("Press <key> to roll the second dice");
		sc.nextLine();
		dice.setDiceValue();
		dice.printDiceValue();
		totalValue += dice.getDiceValue();
		System.out.println("Your total value is: " + totalValue);
	}

}
