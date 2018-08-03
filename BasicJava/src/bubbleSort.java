package src;

//Sorting array elements using bubble sort
public class bubbleSort {
	// returns integer array after sorting the array elements
	int[] bubble_Sort(int[] arr, int length) {
		int temp = 0;// local variable

		for (int outer = 0; outer < length - 1; outer++) {// outer for loop
			for (int inner = 0; inner < length - outer - 1; inner++) {// inner for loop
				if (arr[inner] > arr[inner + 1]) {// Swap if current element greater than next
					temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1] = temp;
				}
			}
		}

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 52, 86, 47 };// predefined array

		bubbleSort sort = new bubbleSort(); // Instantiating the class
		sort.bubble_Sort(arr, arr.length);// bubble_Sort sorts the elements of array(arr)

		for (int sortedarray : arr) {// for each loop for printing sorted array
			System.out.println(sortedarray);
		}
	}
}
