package hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
	public static void main(String args[]) {
		int arr[] = { 5, 4, 2, 1 };
		int k = 8;
		System.out.println(isPairPresent(arr, k));
	}

	public static boolean isPairPresent(int arr[], int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(k - arr[i])) {
				return true;
			} else {
				set.add(arr[i]);
			}
		}
		return false;
	}
}