package Polygon;

public class Square implements Polygon {

	double a;

	@Override
	public double getPerimeter() {
		return a;
	}

	@Override
	public double getArea() {
		return (double) (a * a);
	}

	public Square(double side) {
		this.a = side;
	}

}
