package sorting;

public class MergeTwoSortedArrays {
	public static void main(String args[])
	{
		int arr1[]= {1,3,5};
		int arr2[]= {2,4,6};
		mergeSortedArrays(arr1,arr2);
	}
	
	public static void mergeSortedArrays(int[] arr1,int[] arr2)
	{
		int size=arr1.length+arr2.length;
		int[] arr=new int[size];
		int x=0;
		int y=0;
		int z=0;
		while(x<arr1.length && y<arr2.length)
		{
			if(arr1[x]<arr2[y])
			{
				arr[z++]=arr1[x++];
			}
			else
			{
				arr[z++]=arr2[y++];
			}
		}
		while(y<arr2.length)
		{
			arr[z++]=arr2[y++];
		}
		while(x<arr1.length)
		{
			arr[z++]=arr1[x++];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}