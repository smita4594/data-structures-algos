package linkedList;

public class Runner {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertEnd(7);
		linkedList.insertEnd(8);
		linkedList.insertEnd(10);
		linkedList.insertBegin(6);
		linkedList.insertAtPosition(9, 4);
		linkedList.deleteAtPosition(3);
		/*
		 * System.out.println(linkedList.getSize()); linkedList.printList();
		 * linkedList.deleteBegin(); System.out.println(); linkedList.printList();
		 * linkedList.deleteEnd(); System.out.println();
		 */
		linkedList.printList();
		}
}