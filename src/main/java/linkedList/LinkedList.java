package linkedList;

public class LinkedList {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	public LinkedList() {
		head = null;
	}

	public void insertEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	public int getSize() {
		int count = 0;
		if (head == null) {
			return count;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
				count++;
			}
			return count + 1;
		}
	}

	public void printList() {
		if (head == null) {
			System.out.println("empty list");
		} else {
			Node current = head;
			while (current.next != null) {
				System.out.println(current.data);
				current = current.next;
			}
			System.out.println(current.data);
		}
	}
}