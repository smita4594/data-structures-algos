package binarySearch;

public class BinarySearchBasic {
	public static void main(String args[]) {
		int arr[] = { 5 };
		System.out.println("ans is:" + binarySearch(arr, 5));
	}

	public static boolean binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}
}