package recursion;

public class Permutation {
	public static void main(String args[]) {
		String s = "abc";
		int index = 0;
		int length = s.length();
		permutation(s, index, length);
	}

	public static void permutation(String s, int i, int length) {
		if (i == length) {
			System.out.println(s);
			return;
		} else {
			for (int j = i; j < length; j++) {
				s = swap(s, i, j);
				permutation(s, i + 1, length);
				s = swap(s, i, j);
			}
		}
	}

	public static String swap(String s, int i, int j) {
		String[] string = s.split("");
		String temp = string[i];
		string[i] = string[j];
		string[j] = temp;
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < string.length; k++) {
			sb.append(string[k]);
		}
		return sb.toString();
	}
}