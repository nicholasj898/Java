package Polygon;

public class Octagon implements Polygon {

	double a;

	@Override
	public double getPerimeter() {
		return a * 8;
	}

	@Override
	public double getArea() {
		return (double) (2 * (1 + Math.sqrt(2)) * a * a);
	}

	public Octagon(double side) {
		this.a = side;
	}
}
