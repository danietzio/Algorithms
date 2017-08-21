class ResizingArrayQueueOfStrings<Item> {
	Item [] queue; 
	int start, end;
	
	public ResizingArrayQueueOfStrings() {
		// TODO Auto-generated constructor stub
		queue = ( Item[] ) new Object[2];
		end = 0;
		start = 0;
	}
	
	void enqueue(Item item) { // add an item
		if( queue.length == end ) {
			Item[] temp = ( Item[] ) new Object[ end * 2 ];
			for( int i = 0; i < queue.length ; i++ ) {
				temp[i] = queue[i];
			}
			queue = temp;
		}
		
		queue[end++] = item;
	}
	
	Item dequeue() { // remove the least recently added item
		if( start > end / 2) {
			Item[] temp = ( Item [] ) new Object[ end / 2 ];
			
			for(int i= start ; i < end; i++) {
				temp[ i - start ] = queue[i];
			}
			
			end = end - start;
			queue = temp;
			start = 0;
		}
		
		Item temp1 = queue[start];
		queue[start++] = null;
		return temp1;
	}
	
	boolean isEmpty() { // is the queue empty?
		return start == end;
	}
	
	int size() { // number of items in the queue
		return end - start;
	}
}

public class ResizingArrayQueueOfStringsS1S3Q14P163 {
	public static void main(String[] args) {
		ResizingArrayQueueOfStrings<String> queue = new ResizingArrayQueueOfStrings();
		
		queue.enqueue("First");
		queue.enqueue("Second");
		queue.enqueue("Third");
		queue.enqueue("Forth");
		
		StdOut.println("Size of the queue ======> " + queue.size());
		
		while(!queue.isEmpty()) {
			StdOut.print(queue.dequeue());
			
			if(!queue.isEmpty()) {StdOut.print(" , "); }
		}
		
		StdOut.println();
	}
}
