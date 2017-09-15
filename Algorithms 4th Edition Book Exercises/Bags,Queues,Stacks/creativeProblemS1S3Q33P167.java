import java.util.Iterator;

class Deque<Item> extends linkListS1S3Q31<Item> implements Iterable<Item> {
	// linkListS1S3Q31 that we'd implemented, was doubly-linked list
	// Deque is a data type like stacks and queues but supports adding and removing
	// items at both sides
	
	
	// Checking deque is empty or not!!!
	boolean isEmpty() {
		return this.first == null;
	}
	
	// Getting number of the items remain in the deque
	int size() {
		Node current = first;
		int count = 0;
		
		// Iterate through the linked list
		while(current != null) {
			current = current.next;
			count++;
		}
		
		return count;
	}
	
	// Push item to the left side of the deque
	void pushLeft(Item item) {
		this.insert_at_start(item);
	}
	
	// Push item to the right side of the deque
	void pushRight(Item item) {
		this.insert_at_end(item);
	}
	
	// Pop item from the left side of the deque
	Item popLeft() {
		return this.remove_from_start();
	}
	
	// Pop item from the right side of the deque
	Item popRight() {
		return this.remove_from_end();
	}
	
	public Iterator<Item> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<Item> {
		private Node current = first;
		
		public boolean hasNext() {
			return current != null;
		}
		
		public void remove() {}
		
		public Item next() {
			Item item = current.item;
			current = current.next;
			
			return item;
		}
	}
}

public class creativeProblemS1S3Q33P167 {
	public static void main(String []args) {
		Deque<String> dqu = new Deque();
		
		// isEmpty operation usage
		StdOut.println("Deque " + (dqu.isEmpty() ? "Is Empty" : "Isn't Empty" ));
		
		// push left operation usage
		dqu.pushLeft("First");
		dqu.pushLeft("Second");
		dqu.pushLeft("Third");
		dqu.pushLeft("Forth");
		
		StdOut.println(dqu.toString());
		
		// push right operation usage
		dqu.pushRight("First");
		dqu.pushRight("Second");
		dqu.pushRight("Third");
		dqu.pushRight("Forth");

		StdOut.println(dqu.toString());
		
		// pop left && pop right operations usage 
		while(!dqu.isEmpty()) {
			StdOut.println("Pop from right : " + dqu.popRight());
			if(!dqu.isEmpty()) { StdOut.println("Pop from left: " + dqu.popLeft()); }
		}
	}
}
