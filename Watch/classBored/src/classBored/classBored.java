package classBored;

import java.util.Random;
import java.util.Scanner;

public class classBored {
	public static void main(String[] args) {

		int[] blue = { 0, 0 };
		int[] red = { 0, 0 };
		int[] other = { 0, 0 };

		Scanner rdr = new Scanner(System.in);
		System.out.print("How many cars are driving by this hour?");
		int cars = rdr.nextInt();
		System.out.print("Percentage that I see (0-100)?");
		int pct = rdr.nextInt();
		
		for (int i = 0; i < cars; i++) {
			Random random = new Random();
			int carColor = random.nextInt(100);
			int asleep = random.nextInt(2);
			if (asleep == 1) {
				System.out.println("You missed a car");
			}
			if (carColor < 10) {
				blue[asleep]++;
				System.out.println("That one was blue");
			} else if (carColor < 25) {
				red[asleep]++;
				System.out.println("That one was red");
			} else {
				other[asleep]++;
				System.out.println("That one was an ugly color");
			}
		}
		;
		System.out.print("Blue cars:  " + (blue[0] + blue[1]));
		System.out.println(" (seen/missed " + blue[0] + "/" + blue[1] + " )");
		System.out.print("Red cars:  " + (red[0] + red[1]));
		System.out.println(" seen/missed " + red[0] + "/" + red[1] + " )");
		System.out.print("Other Color:" + (other[0] + other[1]));
		System.out.println(" (seen/missed " + other[0] + "/" + other[1] + " )");
		rdr.close();
	}
}