package lab1;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner1 = new Scanner(System.in);
		System.out.print("Enter starting value: ");
		int starting = myScanner1.nextInt();

		Scanner myScanner2 = new Scanner(System.in);
		System.out.print("Enter ending value: ");
		int ending = myScanner2.nextInt();

		Scanner myScanner3 = new Scanner(System.in);
		System.out.print("Enter increment: ");
		int increment = myScanner2.nextInt();

		System.out.println("US$         S$");
		System.out.println("--------------");
		for (int i = starting; i <= ending; i += increment) {
			System.out.println(String.format("%-12d", i) + String.format("%.2f", i * 1.82));
		}
	}

}
