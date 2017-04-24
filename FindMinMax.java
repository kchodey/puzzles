package Numbers;

public class FindMinMax {

	public static void main(String[] args) {
		int[] arr = { 5, -3, 2, 4, 1, -2, 6, -5, -6, 6, 8 };

		findMinMax(arr);
	}

	/**
	 * <b>Description : </b> Finds min and max of the array.
	 * 
	 * @param arr
	 *            , not null
	 */
	private static void findMinMax(int[] arr) {
		int len = arr.length;

		int count = 0; // Counter for comparisons
		int min, max, start;

		count++;
		// Set the initial max and min elements
		if (len % 2 == 0) {
			count++;
			if (arr[0] < arr[1]) {
				min = arr[0];
				max = arr[1];
			} else {
				min = arr[1];
				max = arr[0];
			}
			start = 2;
		} else {
			min = max = arr[0];
			start = 1;
		}

		// Iterate over rest of the array.
		for (int i = start; i < arr.length - 1; i = i + 2) {
			count++;
			if (arr[i] > arr[i + 1]) {
				if (arr[i] > max) {
					max = arr[i];
				}
				if (arr[i + 1] < min) {
					min = arr[i + 1];
				}
				count++;
				count++;
			} else {
				if (arr[i + 1] > max) {
					max = arr[i + 1];
				}

				if (arr[i] < min) {
					min = arr[i];
				}
				count++;
				count++;
			}
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Comparisons: " + count);
	}
}