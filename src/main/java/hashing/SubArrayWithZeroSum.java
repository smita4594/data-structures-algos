package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
	public static void main(String args[]) {
		int arr[] = { 3, 0 };
		System.out.println(zeroSum(arr));
	}

	public static boolean zeroSum(int arr[]) {
		int sum = 0;
		Set<Integer> set = new HashSet<Integer>();
		set.add(sum);
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (set.contains(sum)) {
				return true;
			} else {
				set.add(sum);
			}
		}
		return false;
	}
}