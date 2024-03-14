package lab4p2;

public class Triangle3D extends Shape3D {
	public Triangle3D(double b, double h, boolean circleBase) {
		double l = Math.sqrt(b * b / 4 + h * h);
		if (circleBase) {
			shapes = new Shape[] { new Circle(b / 2), new Triangle(Math.PI * b, l) };
		} else {
			shapes = new Shape[] { new Square(b), new Triangle(b, l), new Triangle(b, l), new Triangle(b, l),
					new Triangle(b, l) };
		}
	}
}
