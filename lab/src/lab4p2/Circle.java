package lab4p2;

public class Circle implements Shape {
	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public double findArea() {
		return Math.PI * radius * radius;
	}
}
