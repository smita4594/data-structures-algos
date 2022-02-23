package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 2, 5, 6 };
		int sum = 10;
		System.out.println(givenSum(arr, sum));
	}

	public static boolean givenSum(int arr[], int sum) {
		int arraySum = 0;
		Set<Integer> set = new HashSet<Integer>();
		set.add(arraySum);
		for (int i = 0; i < arr.length; i++) {
			arraySum = arraySum + arr[i];
			set.add(arraySum);
			if (set.contains(arraySum - sum)) {
				return true;
			}
		}
		return false;
	}
}