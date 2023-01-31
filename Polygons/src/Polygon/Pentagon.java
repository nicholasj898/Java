package Polygon;

public class Pentagon implements Polygon {

	double a;

	@Override
	public double getPerimeter() {
		return a * 5;
	}

	@Override
	public double getArea() {
		return (double) (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * a * a) / 4;
	}

	public Pentagon(double side) {
		this.a = side;
	}
}
