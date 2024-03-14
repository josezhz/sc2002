package lab1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter choice: ");
		String choice = myScanner.nextLine();
		
		switch (choice) {
		case "a":
		case "A":
			System.out.println("Action movie fan");
			break;
		case "c":
		case "C":
			System.out.println("Comedy movie fan");
			break;
		case "d":
		case "D":
			System.out.println("Drama movie fan");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}

}
