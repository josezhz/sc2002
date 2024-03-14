package lab4p2;

public class Triangle implements Shape {
	private double base;
	private double height;

	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public double findArea() {
		return base * height / 2;
	}
}
