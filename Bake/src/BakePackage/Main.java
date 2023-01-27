package BakePackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int flavorInp;
		while (true) {
			System.out.println("What flavor cookie do you want?");
			System.out.println("1: Chocolate Chip");
			System.out.println("2. Raisin Oatmeal");
			System.out.println("3. Peanut Butter");
			System.out.println("0: To quit");
			flavorInp = input.nextInt();
			if (flavorInp >= 0 && flavorInp < 4)
				break;
		}
		if (flavorInp > 0) {
			Cookie cookie = new Cookie();
			cookie.SetFlavor(flavorInp);
			Oven oven = new Oven();
			while (true) {
				oven.BakeCookie(cookie);
				if (cookie.isCooked) {
					break;
				}
				System.out.println("Still cooking. Wait (y/n)?");
				String answ = input.next();
				System.out.println(answ);
				if ("n".equalsIgnoreCase(answ)) {
					break;
				}
			}
			Person person = new Person();
			person.CookieStatus(cookie);
		}
		input.close();
		return;
	}

}
