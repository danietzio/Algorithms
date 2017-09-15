import java.util.Random;

// Implementing Random 	Random Queue
class RandomQueue<Item> extends ResizingArrayQueue<Item> {
	Random rand = new Random();
	
	// Is the queue empty?
	boolean isEmpty() {
		return true;
	}
	
	// Remove and return a random item (sample without replacement)
	Item dequeue() {
		
		// Making random index in range of (1, N - 1)
		int change = this.start + rand.nextInt(this.size() - 1);
		
		// Swamping first element with random element in the Resizable array
		//swap(this.queue, 0, change);
		
		// Calling Main dequeue function for removing first element in the resizable array
		return super.dequeue();
	}
	
	// Return a random item, but do not remove (sample with replacement)
	Item sample() {
		
		// Making random index in range of (1, N - 1)
		int change = this.start + rand.nextInt(this.size() - 1);
		
		StdOut.println(change);
		// Swamping first element with random element in the Resizable array
		swap(this.queue, 0, change);
		
		return this.queue[0];
	}
	
	// Swap function for swapping two element in Array
	void swap(Item[] a, int i, int change) {
		Item temp = a[i];
		a[i] = a[change];
		a[change] = temp;
	}
}

public class creativeProblemS1S3Q35P168 {
	public static void main(String [] args) {
		
		// Client usage of the random queue
		// Instantiate RandomQueue Class
		RandomQueue<String> rqueue = new RandomQueue();
		
		// Adding some values to our queue
		rqueue.enqueue("First");
		rqueue.enqueue("Second");
		rqueue.enqueue("Third");
		rqueue.enqueue("Forth");
		rqueue.enqueue("Fifth");
		
		StdOut.println(rqueue.toString());
		
		// remove and return a random item 
		StdOut.println("Dequeue operation: " + rqueue.dequeue());
		StdOut.println("Dequeue operation: " + rqueue.dequeue());
		
		// return a random item 
		StdOut.println("Sample operation: " + rqueue.sample());
		StdOut.println("Sample operation: " + rqueue.sample());
		
	}
}
