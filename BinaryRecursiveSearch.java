public class BinaryRecursiveSearch implements Practice03Search
{ // 
	public String searchName()
	{
		return "Binary Recursive Search";
	}
	public int search(int[] arr, int target)
	{
		return binSearch(arr, target, 0, arr.length-1);
	}
	public int binSearch(int [] arr, int target ,int low, int high)
	{
		low = low;
		high=high;
		int mid = ((low+high)/2);
		if(low>=high)
		{
			return -1;
		}

		else if (arr[mid]>target)
		{ 	high= mid-1;
			return binSearch(arr, target, low, high);
		}

		else
		{	low = mid+1;
			return binSearch(arr, target, low, high);
		}

	}
}