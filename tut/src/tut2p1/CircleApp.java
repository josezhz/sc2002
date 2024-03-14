package tut2p1;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		Circle cir = null; // = new Circle(1);
		System.out.println("==== Circle Cumputation =====");
		System.out.println("|1. Create a new circle     |");
		System.out.println("|2. Print area              |");
		System.out.println("|3. Print circumference     |");
		System.out.println("|4. Quit                    |");
		do {
			System.out.println("Choose option (1-3):");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter the radius to compute the area and circumference");
				double r = sc.nextDouble();
				cir = new Circle(r);
				System.out.println("A new circle is created");
				break;
			case 2:
				if (cir != null)
					cir.printArea();
				break;
			case 3:
				if (cir != null)
					cir.printCircumference();
				break;
			case 4:
				System.out.println("Thank you!!");
			default:
				break;
			}
		} while (1 <= option && option <= 4);
	}

}
