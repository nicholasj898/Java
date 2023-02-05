import java.util.Scanner;

public class Pal {

	public static void main(String[] args) {
		//System.out.println("Test for Palindrone: ");
		String string = new Scanner(System.in).nextLine();
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
/*
		if (reverse.equals(string))
			System.out.println(string + " is a palindrome");
		else
			System.out.println(string + " is not palindrome");
*/
	}
}
