package hashing;

public class Runner {
	public static void main(String args[]) {
		HashTable hashTable = new HashTable();
		System.out.println(hashTable.getIndex("bac"));
		hashTable.put("abc", "pqr");
		hashTable.put("pqr", "mno");
		System.out.println(hashTable.get("pqr"));
	}
}