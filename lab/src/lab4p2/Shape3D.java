package lab4p2;

public class Shape3D {
	Shape[] shapes;

	public double findSurfaceArea() {
		double surfaceArea = 0;
		for (Shape s : shapes) {
			surfaceArea += s.findArea();
		}
		return surfaceArea;
	};
}
