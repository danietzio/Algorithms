import java.util.Iterator;
import java.util.Random;

class RandomQueueIterator<Item> extends RandomQueue<Item> implements Iterable<Item> {
	
	public Iterator<Item> iterator() {
		return new iterableQueue();
	}
	
	private class iterableQueue implements Iterator<Item> {
		
		// Initialzing Index value for keeping track of the array
		int i = 0;
		Random rand = new Random();
		
		iterableQueue() {
			
			// Shuffling array in random order
			shuffleArray(queue);
		}
		
		public boolean hasNext() {
			return i < size();
		}
		
		public Item next() {
			return queue[i++];
		}
		
		public void remove() {}
		
		// Shuffling array in random order
		private void shuffleArray(Item[] a) {
	        rand.nextInt();
	        
	        for (int j = start; j < end; j++) {
	            int change = j + rand.nextInt(end - j);
	            swap(a, i, change);
	        }
	    }
		
		// Swapping two positions in the array
	    private void swap(Item[] a, int i, int change) {
	        Item helper = a[i];
	        a[i] = a[change];
	        a[change] = helper;
	    }
				
	}
}

public class creativeProblemS1S3Q36P168 {
	public static void main(String []args) {
		
		// RandomQueueIterator client code
		// Instantiate RandomQueueIterator class
		RandomQueueIterator<String> rqt = new RandomQueueIterator();
		
		// Adding some values to our queue
		rqt.enqueue("First");
		rqt.enqueue("Second");
		rqt.enqueue("Third");
		rqt.enqueue("Forth");
		rqt.enqueue("Fifth");
		
		// Using iterator functionality
		for( String item : rqt) {
			StdOut.print(item + " ,");
		}
		
		StdOut.println();
	}
}
