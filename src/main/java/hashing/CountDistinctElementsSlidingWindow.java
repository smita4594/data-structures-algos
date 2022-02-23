package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountDistinctElementsSlidingWindow {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40 };
		int k = 3;
		countDistinctSliding(arr, k);
	}

	public static void countDistinctSliding(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = arr.length - 1;
		int i = 0;
		int j = 0;

		while (j <= length) {
			if (map.containsKey(arr[j])) {
				int count = map.get(arr[j]);
				map.put(arr[j], count + 1);
			} else {
				map.put(arr[j], 1);
			}
			if ((j - i) + 1 < k) {
				j++;
			} else if ((j - i) + 1 == k) {
				System.out.println(map.size());
				int count = map.get(arr[i]);
				if (count > 1) {
					map.put(arr[i], count - 1);
				} else if (count == 1) {
					map.remove(arr[i]);
				}
				i++;
				j++;
			}
		}
	}
}