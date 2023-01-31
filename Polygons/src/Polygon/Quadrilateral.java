package Polygon;

public class Quadrilateral implements Polygon {

	double a, b, c, d;

	@Override
	public double getPerimeter() {
		return (double) (a + b + c + d);
	}

	@Override
	public double getArea() {
		double semiperimeter = (a + b + c + d) / 2;
		/* Brahmagupta formular for max area */
		return (double) Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) * (semiperimeter - d));
	}

	public Quadrilateral(double side1, double side2, double side3, double side4) {
		this.a = side1;
		this.b = side2;
		this.c = side3;
		this.d = side4;
	}
}
