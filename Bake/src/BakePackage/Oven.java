package BakePackage;

public class Oven {
	//cook time in seconds
	int[] cookTimes = { 5, 3, 7 };
	
	public void BakeCookie(Cookie cookie) {
		
		int currentCookTime = (int) ((System.currentTimeMillis() - cookie.startTime) / 1000);
		if  (currentCookTime >= cookTimes[cookie.flavorInx]) {
			cookie.isCooked = true;
		} else {
			cookie.isCooked = false;
		}
		//for debug purposes
		//System.out.println(currCookTime);
		return;
	}
}
