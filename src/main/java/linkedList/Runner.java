package linkedList;

public class Runner {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertEnd(7);
		linkedList.insertEnd(8);
		linkedList.insertEnd(9);
		System.out.println(linkedList.getSize());
		linkedList.printList();
	}
}