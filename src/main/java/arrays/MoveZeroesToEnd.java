package arrays;

public class MoveZeroesToEnd {
	public static void main(String args[]) {
		int arr[] = { 1, 0, 2, 0, 3, 0 };
		moveZeroes(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] moveZeroes(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < arr.length) {
			arr[count] = 0;
			count++;
		}
		return arr;
	}
}