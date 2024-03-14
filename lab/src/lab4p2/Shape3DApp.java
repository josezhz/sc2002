package lab4p2;

import java.util.Scanner;

public class Shape3DApp {
	public static void main(String[] args) {
		Shape3D[] shapes;
		int numOfShapes;
		int option;
		boolean circleBase;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total number of 3D shapes: ");
		numOfShapes = sc.nextInt();
		shapes = new Shape3D[numOfShapes];
		do {
			System.out.println("Choose Base Type:\n1. Square Base (cuboid / square pyramid)\n2. Circle Base (cylinder / cone)");
			option = sc.nextInt();
		} while (option < 1 || option > 2);
		if (option == 1)
			circleBase = false;
		else
			circleBase = true;
		for (int i = 0; i < numOfShapes; i++) {
			do {
				System.out.println("Choose shape " + (i + 1) + ":\n1. Square\n2. Rectangle\n3. Circle\n4. Triangle");
				option = sc.nextInt();

			} while (option < 1 || option > 4);
			switch (option) {
			case 1:
				System.out.print("Enter side: ");
				double s = sc.nextDouble();
				shapes[i] = new Square3D(s, circleBase);
				break;
			case 2:
				System.out.print("Enter length: ");
				double l = sc.nextDouble();
				System.out.print("Enter width: ");
				double w = sc.nextDouble();
				shapes[i] = new Rectangle3D(l, w, circleBase);
				break;
			case 3:
				System.out.print("Enter radius: ");
				double r = sc.nextDouble();
				shapes[i] = new Circle3D(r);
				break;
			case 4:
				System.out.print("Enter base: ");
				double b = sc.nextDouble();
				System.out.print("Enter height: ");
				double h = sc.nextDouble();
				shapes[i] = new Triangle3D(b, h, circleBase);
				break;
			}
		}
		do {
			System.out.println("Choose type of calculation\n1. Surface Area");
			option = sc.nextInt();
		} while (option != 1);
		switch (option) {
		case 1:
			double surfaceArea = 0;
			for (Shape3D s : shapes) {
				surfaceArea += s.findSurfaceArea();
			}
			System.out.print("Total surface area = " + surfaceArea);
		}
	}
}
