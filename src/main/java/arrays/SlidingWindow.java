package arrays;

public class SlidingWindow {

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		System.out.print(slidingWindow(arr, k));

	}

	public static int slidingWindow(int[] arr, int k) {

		int j = 0;
		int i = 0;
		int n = arr.length;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		while (j < n) {
			sum += arr[j];
			if ((j - i) + 1 < k) {
				j++;
				continue;

			}
			if ((j - i) + 1 == k) {
				max = java.lang.Math.max(max, sum);
				sum = sum - arr[i];
				j++;
				i++;
			}

		}
		return max;
	}
}
