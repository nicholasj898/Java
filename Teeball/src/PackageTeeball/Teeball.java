package PackageTeeball;

import java.util.Random;

import java.util.Scanner;

public class Teeball {

	public static void main(String[] args) {
		Ball tBall = new Ball();
		Batter  tBatter = new Batter();
		Fielder  tFielder = new Fielder();

		tBatter.SwingStrength(tBall);
		tBatter.SwingAtBall(tBall);

		tFielder.FieldBall(tBall);
		return;

	}

}

class Ball {
	int HitStrength;
	int DistanceHit;
}

class Batter {
	int GetGoodInt;

	public void SwingStrength(Ball tBall) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Strength of hit (1-3)");
			tBall.HitStrength = input.nextInt();
			if (tBall.HitStrength > 0 && tBall.HitStrength < 4) {
				break;
			}
		}
		return;
	}

	public void SwingAtBall(Ball tBall) {
		Random rand = new Random();
		int pct = rand.nextInt(100);
		if (pct < tBall.HitStrength * 15) {
			tBall.DistanceHit = 5;
		} else {
			tBall.DistanceHit = rand.nextInt((150 * tBall.HitStrength - 5) + 1) + 5;
		}
		return;
	}
}

class Fielder {
	void FieldBall(Ball tBall) {
		if (tBall.DistanceHit > 100) {
			System.out.println("You got a hit!");
		} else {
			System.out.println("Your out!");
		}
	}
}
