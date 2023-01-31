package Polygon;

public class IsoscelesTriangle implements Polygon {
	double  a, b;
	@Override
	public double getPerimeter() {
		return a + a + b;
	}

	@Override
	public double getArea() {
		
		return (double) (b / 4) * Math.sqrt((4 * a * a)-(b * b));
	}

	public IsoscelesTriangle(double side1, double side2, double side3) {
		this.a=side1;
		this.a=side2;
		this.b=side3;
	}
}
