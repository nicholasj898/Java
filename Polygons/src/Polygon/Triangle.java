package Polygon;

public class Triangle implements Polygon {

	double  a, b, c;
	@Override
	public double getPerimeter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		double s = (a + b + c) / 2;
		return (double) Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public Triangle(double side1, double side2, double side3) {
		this.a=side1;
		this.b=side2;
		this.c=side3;
	}
}
