import org.apache.commons.lang3.ArrayUtils;

public class binarySearch {

	// Binary Search Algorithm
	public static int rank(int key, int[] a)
	{ // Array must be sorted.
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{ // Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	
	// Function for making arr unique
	public static int[] unique(int [] arr ){
		for (int i = 0; i + 1 != arr.length ;) {
			if(arr[i + 1] == arr[i]) {
				arr = ArrayUtils.remove(arr, i);
			}
			else i++;
		}
		
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] whitelist = StdIn.readAllInts();
		
		// Sorting Array
		Arrays.sort(whitelist);
		
		// Making whiltelist unique
		whitelist = unique(whitelist);
		
		while (!StdIn.isEmpty())
			{ // Read key, print if not in whitelist.
				int key = StdIn.readInt();
					if (rank(key, whitelist) < 0)
							StdOut.println(key);
			}
	}

}
