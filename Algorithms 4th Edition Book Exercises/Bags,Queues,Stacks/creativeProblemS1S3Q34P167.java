import java.util.Iterator;
import java.util.Random;

class RandomBag<Item> implements Iterable<Item> {
	private Node first; // first node in list
	private class Node {
		Item item;
		Node next;
	}
	
	public void add(Item item) { // same as push() in Stack
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		int count = 0;
		Node current = first;
		
		while( current != null ) {
			current = current.next;
			count++;
		}
		
		return count;
	}
	
	public Iterator<Item> iterator() {
		return new linkListIterator();
	}
	
	
	private class linkListIterator implements Iterator<Item> {
		private Node current = first;
		Item[] arr = null;
		
		// Initialzing Index value for keeping track of the array
		int i = 0;
		
		// Getting linked list length
		int size = size();
		
		
		linkListIterator() {
			
			// Creating container for linkedlist vlaues
			arr = (Item [])new Object[size];
			
			// Tracing Linked list and creating equal size array for later usage
			for(int i = 0;  current != null; i++) {
				arr[i] = current.item;
				current = current.next;
			}
			
			// Shuffling array in random order
			arr = shuffleArray(arr);
		}
		
		
		// Checking whether we've reached end of the array or not !!!
		public boolean hasNext() {
			return i < size;
		}
		
		// Returning next item in the array
		public Item next() {
			return arr[i++];
		}
		
		public void remove() {}
		
		
		// Shuffling array in random order
		private Item[] shuffleArray(Item[] a) {
	        int n = a.length;
	        Random random = new Random();
	        random.nextInt();
	        for (int i = 0; i < n; i++) {
	            int change = i + random.nextInt(n - i);
	            swap(a, i, change);
	        }
	        
	        return a;
	    }

		// Swapping two positions in the array
	    private void swap(Item[] a, int i, int change) {
	        Item helper = a[i];
	        a[i] = a[change];
	        a[change] = helper;
	    }
	}	
}


public class creativeProblemS1S3Q34P167 {
	public static void main(String[] args) {
		
		// RandomBag Client Code
		// Instantiate new bag
		RandomBag<String> bag = new RandomBag();
		
		// Adding new values to our bag
		bag.add("First");
		bag.add("Second");
		bag.add("Third");
		bag.add("Forth");
		bag.add("Fifth");
		
		// Printing Values of the bag with Iterator functionality
		for ( String a: bag) {
			StdOut.print(a + " ,");
		}
		
		// Print new line after function ended !!!
		StdOut.println();
	}
}
