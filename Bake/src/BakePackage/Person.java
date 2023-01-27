package BakePackage;

public class Person {
	public void CookieStatus(Cookie cookie) {
		if (cookie.isCooked == true) {
			System.out.println("Your " + cookie.flavor + " cookie is baked!");
		} else {
			System.out.println("Your " + cookie.flavor + " cookie is raw.");
		}
	}
}