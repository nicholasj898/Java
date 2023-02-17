package InsertionSortPackage;

public class SortMethods {
	public static int moves = 0;
	
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int k = 1; k < n; k++) {
			int cur = array[k];
			int j = k;
			while (j > 0 && array[j - 1] > cur) {
				array[j] = array[j - 1];
				j--;
				moves++;
			}
			array[j] = cur;
		}
	}

	public static void recursiveSort(int array[], int n, int j) {
		if (j < n) {
			int i;
			int temp = array[j];
			for (i = j; i > 0 && array[i - 1] > temp; i--) {
				array[i] = array[i - 1];
				moves++;
			}
			array[i] = temp;
			recursiveSort(array, n, j + 1);
		}
	}

	public static void bubbleSort(int[] array) {
		boolean swap = false;
		while (!swap) {
			swap = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i + 1] < array[i]) {
					swap = false;
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					moves++;
				}
			}
		}
	}

}
