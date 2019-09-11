public class BinaryIterativeSearch implements Practice03Search
{
	public String searchName()
	{	
		return "Iterative Binary Search";
	}
	public int search(int [] arr, int target)
	{
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low<=high) //makes sure that when low crosses over high, the function ends 
		{
			mid=((low+high)/2); //
			if(arr[mid]==target)
			{
				return mid;
			}
			else if (arr[mid]>target)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			} 
		} return -1;
	} 
}