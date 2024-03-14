package lab4p2;

public class Circle3D extends Shape3D {
	public Circle3D(double r) {
		shapes = new Circle[] { new Circle(2 * r) };
	}
}
