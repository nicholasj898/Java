package BakePackage;

public class Cookie {
	boolean isCooked;
	String flavor;
	int flavorInx;
	long startTime;
	
	public void SetFlavor(int flavorPicked) {
		startTime = System.currentTimeMillis();
		flavorInx = flavorPicked - 1;
		if (flavorPicked == 1) {
			flavor = "Chocolate chip";
		} else if (flavorPicked ==2) {
			flavor = "Raisin Oatmeal";
		} else {
			flavor = "Peanut Butter";
		}
	}
}