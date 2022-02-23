package heaps;

public class Heap {
	int[] arr;
	int capacity;
	int size;
	public Heap(int c)
	{
		capacity=c;
		arr=new int[capacity];
		size=0;
	}
	
	public int parent(int i)
	{
		return (i-1)/2;
	}
	
	public int rightChild(int i)
	{
		return (2*i)+2;
	}
	
	public int leftChild(int i)
	{
		return (2*i)+1;
	}
	
	public void insert(int key)
	{
		arr[size]=key;
		int i=size;
		int parent=parent(size);
		
		while(i!=0 && arr[size]<arr[parent])
		{
			int temp=arr[size];
			arr[size]=arr[parent];
			arr[parent]=temp;
			i=parent;
		}
			size++;
	}
	
}

