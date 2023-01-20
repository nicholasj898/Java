package Fill1;

import java.util.Scanner;

public class Fill01 {
	public static void main(String[] args) {
		int x = BlertTwoNumbers(2,3); 
		System.out.println("check = " + x);
		System.out.println("Enter first number between 1 and 12");
		int tFirst = GetGoodInt(1, 12);
		System.out.println("Enter second number between 2 and 7");
		int tSecond = GetGoodInt(2, 7);
		/////
		int tAnswer = BlertTwoNumbers(tFirst, tSecond);
		System.out.println(tAnswer);
		/////
		String tPony = "Pony";
		String tMonkey = "Monkey";
		String tMonster = tMonkey + tPony;
		for (int i = 0; i < 4; i++)
			tMonster = PerformScience(tMonster, tMonkey);
		System.out.println(tMonster);
	}


	
	static int GetGoodInt(int tLow, int tHigh) {
		Scanner input = new Scanner(System.in);
		int Nbr;
		while (true) {
			// (It doesnt rely on the caller to do the loop.)
			Nbr = input.nextInt();
			// You need to make sure the input is an int AND that it is between the two
			// arguments (inclusive)
			// This function may not call itself.
			if (Nbr >= tLow && Nbr <= tHigh)
				break;
			// This doesnt return until it has a good number.
			System.out.println("Integer must be between " + tLow + " and " + tHigh + ". Try Again. ");
		}
		return Nbr;
	}

	// To Blert is to raise the second number to the first's power and then subtract
	// two
	public static int BlertTwoNumbers(int tOne, int tAnother) {
		return (int) Math.pow(tOne, tAnother) - 2;
	}

	// Insert creature two in to the middle of creature one.Science!
	public static String PerformScience(String tCreatureOne, String tCreatureTwo) {
		int length = tCreatureOne.length();
		// Hamster and Emu make a HamEmuster
		return tCreatureOne.substring(0, length / 2) + tCreatureTwo + tCreatureOne.substring(length / 2);
	}
}
