package lab4p2;

public class Rectangle3D extends Shape3D {
	public Rectangle3D(double l, double w, boolean circleBase) {
		if (circleBase) {
			shapes = new Shape[] { new Circle(w / 2), new Circle(w / 2), new Rectangle(Math.PI * w, l) };
		} else {
			shapes = new Rectangle[] { new Square(w), new Square(w), new Rectangle(l, w), new Rectangle(l, w),
					new Rectangle(l, w), new Rectangle(l, w) };
		}
	}
}
