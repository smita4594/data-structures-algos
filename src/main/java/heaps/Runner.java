package heaps;

public class Runner {
	public static void main(String args[]) {
		Heap heap = new Heap(5);
		System.out.println(heap.parent(2));
		System.out.println(heap.parent(1));
		System.out.println(heap.leftChild(0));
		System.out.println(heap.rightChild(0));
		heap.insert(10);
		heap.insert(20);
		heap.insert(9);
	}
}