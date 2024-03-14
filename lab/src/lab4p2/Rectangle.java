package lab4p2;

public class Rectangle implements Shape {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double findArea() {
		return length * width;
	}
}
