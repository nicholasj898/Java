package Package01;

import java.util.Scanner;

public class Class01 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int nbr = reader.nextInt();
		
		System.out.println("********");
		System.out.println("*      *");
		System.out.println("*      *");
		System.out.println("*  " + nbr + "   *");
		System.out.println("*      *");
		System.out.println("*      *");
		System.out.println("********");
		
		reader.close();

	}

}
