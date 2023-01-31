package Polygon;

public class Rectangle implements Polygon {

	double a, b;
	@Override
	public double getPerimeter() {
 
		return (double) (2 * a) + (2 * b);
	}

	@Override
	public double getArea() {
		return (double) (a * b);
	}

	public Rectangle(double side1, double side2) {
		this.a=side1;
		this.b=side2;
	}
}
