package InsertionSortPackage;

public class Control {
	
	public static void main(String[] args) {
		// O(N^2) O(N^2)
		SortMethods sm = new SortMethods();
		int [] arr1 = { 55, 9, 118, 220, 152, 200, 198, 319, 245, 315, 379, 99, 
				191, 343, 394, 31, 3, 345, 274, 43, 52, 324, 283, 7, 65, 70, 56, 344, 18, 
				360, 104, 349, 309, 149, 94, 160, 111, 370, 235, 8, 81, 379, 213, 379, 
				201, 399, 390, 160, 369, 113, 340, 178, 281, 160, 232, 241, 348, 160, 29, 
				179, 65, 327, 7, 88, 305, 180, 334, 27, 303, 281, 341, 260, 393, 105, 219, 
				170, 346, 380, 14, 134, 169, 336, 54, 178, 177, 122, 21, 145, 398, 170, 
				201, 104, 161, 380, 332, 234, 48, 251, 105, 33  };
		
		/* don't want to use a pre-sorted list */
		int [] arr2 = { 55, 9, 118, 220, 152, 200, 198, 319, 245, 315, 379, 99, 
				191, 343, 394, 31, 3, 345, 274, 43, 52, 324, 283, 7, 65, 70, 56, 344, 18, 
				360, 104, 349, 309, 149, 94, 160, 111, 370, 235, 8, 81, 379, 213, 379, 
				201, 399, 390, 160, 369, 113, 340, 178, 281, 160, 232, 241, 348, 160, 29, 
				179, 65, 327, 7, 88, 305, 180, 334, 27, 303, 281, 341, 260, 393, 105, 219, 
				170, 346, 380, 14, 134, 169, 336, 54, 178, 177, 122, 21, 145, 398, 170, 
				201, 104, 161, 380, 332, 234, 48, 251, 105, 33  };
		
		/* don't want to use a pre-sorted list */
		int [] arr3 = { 55, 9, 118, 220, 152, 200, 198, 319, 245, 315, 379, 99, 
				191, 343, 394, 31, 3, 345, 274, 43, 52, 324, 283, 7, 65, 70, 56, 344, 18, 
				360, 104, 349, 309, 149, 94, 160, 111, 370, 235, 8, 81, 379, 213, 379, 
				201, 399, 390, 160, 369, 113, 340, 178, 281, 160, 232, 241, 348, 160, 29, 
				179, 65, 327, 7, 88, 305, 180, 334, 27, 303, 281, 341, 260, 393, 105, 219, 
				170, 346, 380, 14, 134, 169, 336, 54, 178, 177, 122, 21, 145, 398, 170, 
				201, 104, 161, 380, 332, 234, 48, 251, 105, 33  };
		
		//Insertion
		long startTime = System.nanoTime();
		sm.insertionSort(arr1);
		long endTime = System.nanoTime();
		System.out.println("Moves:" + sm.moves);
		System.out.println("Run Time: " + (endTime - startTime));
		
		//Recursive
		sm.moves=0;
		startTime = System.nanoTime();
		sm.recursiveSort(arr2, arr2.length, 0 );
		endTime = System.nanoTime();
		System.out.println("Moves:" + sm.moves);
		System.out.println("Run Time: " + (endTime - startTime));
		
		//Bubble
		sm.moves=0;
		startTime = System.nanoTime();
		sm.bubbleSort(arr3);
		endTime = System.nanoTime();
		System.out.println("Moves:" + sm.moves);
		System.out.println("Run Time: " + (endTime - startTime));
				
	}

}
