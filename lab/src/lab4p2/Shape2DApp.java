package lab4p2;

import java.util.Scanner;

public class Shape2DApp {
	public static void main(String[] args) {
		Shape[] shapes;
		int numOfShapes;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of shapes: ");
		numOfShapes = sc.nextInt();
		shapes = new Shape[numOfShapes];
		for (int i = 0; i < numOfShapes; i++) {
			do {
				System.out.println("Choose shape " + (i + 1) + "\n1. Square\n2. Rectangle\n3. Circle\n4. Triangle");
				option = sc.nextInt();
			} while (option < 1 || option > 4);
			switch (option) {
			case 1:
				System.out.print("Enter side: ");
				double s = sc.nextDouble();
				shapes[i] = new Square(s);
				break;
			case 2:
				System.out.print("Enter length: ");
				double l = sc.nextDouble();
				System.out.print("Enter width: ");
				double w = sc.nextDouble();
				shapes[i] = new Rectangle(l, w);
				break;
			case 3:
				System.out.print("Enter radius: ");
				double r = sc.nextDouble();
				shapes[i] = new Circle(r);
				break;
			case 4:
				System.out.print("Enter base");
				double b = sc.nextDouble();
				System.out.print("Enter height: ");
				double h = sc.nextDouble();
				shapes[i] = new Triangle(b, h);
				break;
			}
		}
		do {
			System.out.println("Choose type of calculation\n1. Area");
			option = sc.nextInt();
		} while (option != 1);
		switch (option) {
		case 1:
			double area = 0;
			for (Shape s : shapes) {
				area += s.findArea();
			}
			System.out.print("Total area = " + area);
		}
	}
}
