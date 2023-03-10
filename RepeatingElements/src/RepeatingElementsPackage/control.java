package RepeatingElementsPackage;

import java.io.*;
import java.util.Scanner;

public class control {

	// O(N^2) O(N^2)
	public static void main(String[] args) {
		
		int [] arr = { 55, 9, 118, 220, 152, 200, 198, 319, 245, 315, 379, 99, 
				191, 343, 394, 31, 3, 345, 274, 43, 52, 324, 283, 7, 65, 70, 56, 344, 18, 
				360, 104, 349, 309, 149, 94, 160, 111, 370, 235, 8, 81, 379, 213, 379, 
				201, 399, 390, 160, 369, 113, 340, 178, 281, 160, 232, 241, 348, 160, 29, 
				179, 65, 327, 7, 88, 305, 180, 334, 27, 303, 281, 341, 260, 393, 105, 219, 
				170, 346, 380, 14, 134, 169, 336, 54, 178, 177, 122, 21, 145, 398, 170, 
				201, 104, 161, 380, 332, 234, 48, 251, 105, 33  };

		int n = arr.length;
		int k = (4 * n);
	
		long startTime = System.nanoTime();
		RepeatingMethods rm = new RepeatingMethods();
		System.out.println("Maximum repeating element: " + rm.maxRepeat(arr, n, k));
		long endTime = System.nanoTime();
		System.out.println("Run Time: " + (endTime - startTime));
		
		System.out.println("Maximum repeating element: " + rm.maxRepeatRecur(arr, n, k));
	}

}
