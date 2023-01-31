package Polygon;

public class EquilateralTriangle implements Polygon {

	double  a;
	@Override
	public double getPerimeter() {
		
		return a * 3;
	}

	@Override
	public double getArea() {
		return (double)  (Math.sqrt(3)/4) * (a * a);
	}

	public EquilateralTriangle(double side) {
		this.a=side;
	}
}
