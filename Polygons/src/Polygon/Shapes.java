package Polygon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		List<Double> vals = new ArrayList<Double>();
		//System.out.println("enter between 1 and 4 numbers");
		while (true) {
			String x = input.nextLine();
			if (!isNumeric(x))
				break;
			vals.add(Double.parseDouble(x));
			if (vals.size() > 3)
				break;
		}

		if (vals.size() == 1) {
			Polygon sqr = new Square(vals.get(0));
			//System.out.println("Square Area:       " + sqr.getArea());
			//System.out.println("Square Perimeter:  " + sqr.getPerimeter());

			Polygon pen = new Pentagon(vals.get(0));
			//System.out.println("Pentagon Area:      " + pen.getArea());
			//System.out.println("Pentagon Perimeter: " + pen.getPerimeter());

			Polygon hex = new Hexagon(vals.get(0));
			//System.out.println("Hexagon Area:       " + hex.getArea());
			//System.out.println("Hexagon Perimeter:  " + hex.getPerimeter());

			Polygon oct = new Octagon(vals.get(0));
			//System.out.println("Octagon Area:       " + oct.getArea());
			//System.out.println("Octagon Perimeter:  " + oct.getPerimeter());
			
		} else if (vals.size() == 2) {
			
			Polygon rec = new Rectangle(vals.get(0), vals.get(1));
			//System.out.println("Rectangle Area:      " + rec.getArea());
			//System.out.println("Rectangle Perimeter: " + rec.getPerimeter());
			
		} else if (vals.size() == 3) {

			Polygon tri = new Triangle(vals.get(0), vals.get(1), vals.get(2));
			//System.out.println("Triangle Area:      " + tri.getArea());
			//System.out.println("Triangle Perimeter: " + tri.getPerimeter());

		} else if (vals.size() == 4) {
			
			Polygon qud = new Quadrilateral(vals.get(0), vals.get(1), vals.get(2), vals.get(3));
			//System.out.println("Quadrilateral Area:      " + qud.getArea());
			//System.out.println("Quadrilateral Perimeter: " + qud.getPerimeter());

		}
	}

	public static boolean isNumeric(String str) {
		try {
			double check = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
}
