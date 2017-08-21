import java.util.Arrays;

public class BinarySearch_Equals {
	
	// Binary Search Algorithm
	public static int rank(float key, int[] a)
	{ // Array must be sorted.
		int lo = 0;
		int hi = a.length - 1;
		int mid = 0;
	
		while (lo <= hi)
		{ // Key is in a[lo..hi] or not present.
			mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else {
				// Key Founded
				
				int i = mid;
				if ( i > 0 ) {
					while(a[mid] == a[--i]) {
						// Doing Nothing
					}
					return i + 1;
				}
				else {
					return mid;
				}
			}
		}

		// Key Not Founded
		if ( a[mid] > key ) return mid;
		else if ( a[mid] < key ) return mid - 1;
		else return -1;
	}
	
	// Binary Search Algorithm
	public static int count(float key, int[] a)
	{ // Array must be sorted.
		int lo = 0;
		int hi = a.length - 1;
		int mid = 0,count = 0;
		
		while (lo <= hi)
		{ 
			mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else {
				
				// First one finded
				count++;
				
				// Trying to find others
				int i = mid, j = mid;
				while( ( i < a.length - 1 && a[mid] == a[++i] ) || ( j > 0 && a[mid] == a[--j] ) ) {
					count++;
				}
				
				// returning number of occurence of that element
				return count;
			}
		}

		return 0;
	}
	
	public static void main(String[] args)
	{
		
		int[] whitelist = {1,2,3,3,4,4,5,1,2,3,4};
		
		// Sorting Array
		Arrays.sort(whitelist);
		
		while (!StdIn.isEmpty())
			{ // Read key, print if not in whitelist.
				float key = StdIn.readFloat();
				
				int i = rank(key, whitelist);
				int j = count(key, whitelist);
				
				StdOut.printf("%d %d\n", i, j);
				for (int j2 = i; j2 <= i + j - 1; j2++) {
					StdOut.print(whitelist[j2] + ", ");
				}
				StdOut.println();
			}
	}

}
