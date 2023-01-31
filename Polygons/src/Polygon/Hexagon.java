package Polygon;

public class Hexagon implements Polygon {

	double a;

	@Override 
	public double getPerimeter() {
		return a * 6;
	}

	@Override
	public double getArea() {
		return (double) ((3 * Math.sqrt(3) * (a * a)) / 2);
	}

	public Hexagon(double side) {
		this.a = side;
	}
}
