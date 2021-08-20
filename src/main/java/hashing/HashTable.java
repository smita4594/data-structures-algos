package hashing;

public class HashTable {
	int capacity = 16;
	Entry hashTable[] = new Entry[capacity];

	public class Entry {
		String key;
		String value;
		Entry next;

		public Entry(String key, String value) {
			this.key = key;
			this.value = value;
			next = null;
		}
	}

	public String get(String key) {
		int index = getIndex(key);
		Entry entries = hashTable[index];
		if (entries == null) {
			return null;
		} else {
			Entry head = entries;
			while (head.next != null) {
				if (head.key.equals(key))
					break;
				head = head.next;
			}
			return head.value;
		}

	}

	public void put(String key, String value) {
		Entry entry = new Entry(key, value);
		int index = getIndex(key);
		Entry entries = hashTable[index];
		if (entries == null) {
			hashTable[index] = entry;
		} else {
			Entry head = entries;
			while (head.next != null) {
				head = head.next;
			}
			head.next = entry;
		}
	}

	public int getIndex(String key) {
		int hashCode = key.hashCode();
		int index = hashCode % capacity;
		return index;
	}
}