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

	public void deleteBegin() {
		if (head == null) {
			System.out.println("Empty linked List");
		} else {
			head = head.next;
		}
	}

	public void deleteEnd() {
		if (head == null) {
			System.out.println("Empty linked list");
		} else if (head.next == null) {
			head = null;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void insertBegin(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;

		}
	}

	public void insertAtPosition(int data, int position) {
		Node node = new Node(data);
		if (head == null) {
			System.out.println("empty list");
		} else {
			int count = 1;
			Node current = head;
			while (current.next != null && count != (position - 1)) {
				current = current.next;
				count++;
			}
			node.next = current.next;
			current.next = node;
		}
	}

	public void deleteAtPosition(int position) {
		if (head == null) {
			System.out.println("empty list");
		} else {
			int count = 1;
			Node current = head;
			while (current.next != null && count != (position - 1)) {
				current = current.next;
				count++;
			}
			current.next = current.next.next;
		}
	}
}