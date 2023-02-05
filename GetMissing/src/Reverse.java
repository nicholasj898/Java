import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//System.out.println("What would you like to reverse?");
		String string = scanner.next();

		//System.out.println("The reverse of " + string + " is");
		String reverse = new StringBuffer(string).reverse().toString();

		reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		//System.out.println(reverse);
	}
}
