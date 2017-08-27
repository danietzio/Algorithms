class circularLinkedList<Item> {
	
	// Pointer to last node in linked list
	Node last;
	
	// Defining Node Structure
	class Node {
		Item item;
		Node next;
	}
	
	void insert(Item item) {
		
		// Creating new node
		Node temp = new Node();
		
		// Saving item value inside new node
		temp.item = item;
		
		// Checking whether list is empty or not
		if(last != null) {
			
			// Adding other node to first of the list
			temp.next = last.next;
			last.next = temp;
		} else {
			
			// Creating first node in the list
			last = temp;
			last.next = last;
		}
	}
	
	Item dequeue() {
		// Creating value holder of the removed node
		Item temp = last.item;
		
		// Current point to first node in the linked list
		Node current = last.next;
		
		// This while executes until pointer reaches to last node of the linked list
		while(current.next != last) { current = current.next; }
		
		current.next = last.next;
		last = current; 
		
		return temp;
	}
	
	@Override
	public String toString() {
		String temp = "";
		
		// Current point to first node in the linked list
		Node current = last.next;
		
		// This while executes until pointer reaches to first of the linked list again
		while(current.next != last.next) {
			temp += current.item + " , ";
			current = current.next;
		}
		
		temp += current.item;
		return temp;
	}
}

public class linkedListS1S3Q29P165 {
	public static void main(String []args) {
		circularLinkedList<Integer> circular_queue = new circularLinkedList();
		
		circular_queue.insert(1);
		circular_queue.insert(3);
		circular_queue.insert(2);
		circular_queue.insert(7);
		circular_queue.insert(2);
		
		StdOut.println(circular_queue.toString());
		
		StdOut.println("Value return from dequeue function ==> " + circular_queue.dequeue());
		
		StdOut.println(circular_queue.toString());
	}
}
