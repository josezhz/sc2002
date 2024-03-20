package lab4p1;

public class Sorting {
	// -----------------------------------------------------------------
	// Sorts the specified array of objects using the selection
	// sort algorithm.
	// -----------------------------------------------------------------
	public static void selectionSort(int[] list) {
		int min;
		int temp;
		for (int index = 0; index < list.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan] < (list[min]))
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	public static void selectionSort(String[] list) {
		int min;
		String temp;
		for (int index = 0; index < list.length - 1; index++) {
			min = 0;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	// -----------------------------------------------------------------
	// Sorts the specified array of objects using the insertion
	// sort algorithm.
	// -----------------------------------------------------------------
	public static void insertionSort(int[] list) {
		for (int index = 1; index < list.length; index++) {
			int key = list[index];
			int position = index;
			// Shift larger values to the right
			while (position > 0 && key > (list[position - 1])) {
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}

	public static void insertionSort(String[] list) {
		for (int index = 1; index < list.length; index++) {
			String key = list[index];
			int position = index;
			// Shift larger values to the right
			while (position > 0 && key.compareTo(list[position - 1]) > 0) {
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}

	public static void insertionSort(SalePerson[] list) {
		for (int index = 1; index < list.length; index++) {
			SalePerson key = list[index];
			int position = index;
			// Shift larger values to the right
			while (position > 0 && key.compareTo(list[position - 1]) > 0) {
				
				list[position] = list[position - 1];
				position--;
			}
			list[position] = key;
		}
	}
}
//