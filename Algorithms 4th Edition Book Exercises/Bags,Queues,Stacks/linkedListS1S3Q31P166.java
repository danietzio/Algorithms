// Double Linked List
class linkListS1S3Q31<Item> {
	
	// Defining initial structure of the each Node in the LinkedList
	protected class Node {
		Node previous = null;
		Node next = null;
		Item item = null;
	}
	
	// Node for holding track of the list head
	Node first = null;
	
	// Inserting new node after the last node
	void insert_at_end(Item item){
		Node current = first;
		
		// Creating new node
		Node node = new Node();
		node.item = item;
		node.next = null;
		node.previous = null; 
				
		// Go to the last node in the linked list
		while( current != null && current.next != null ) {
			current = current.next;
		}
		
		// Checking whether current has changed or not
		if(current == null) {
			
			// current has not changed, so new node is the first and head node of the list
			first = node;
		} else {
			
			// Making new node to point to last node in the list
			node.previous = current;
			
			// Attaching the new node to list, and making last node to point to new node
			current.next = node;
		}
	}
	
	void insert_at_start(Item item) {
		
		// Creating && Initializing new node 
		Node node = new Node();
		node.item = item;
		node.next = first;
		node.previous = null;
		
		// Attaching the new node to linked list ( For non-empty list's )
		if(first != null) {
			first.previous = node;
		} 
		
		// Changing head of the linked list
		first = node; 
	}
	
	Item remove_from_end() {
		Node current = first;
		
		// Finding last node in the linked list
		while( current.next != null ) {
			current = current.next;
		}
		
		// Keeping value of the last node
		Item temp = current.item;
		
		// Detaching the last node from the list
		current.previous.next = null;
		
		// Removing last node with garbage collector
		current = null;
		
		return temp;
	}
	
	Item remove_from_start() {
		
		// Keeping value of the last node
		Item temp = first.item;
		
		// Changing head of the list
		first = first.next;
		
		// Removing old first node with garbage collector
		first.previous = null;
		
		return temp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node current = first;
		String temp = "";
		
		while(current != null && current.next != null) {
			temp += current.item + " , ";
			current = current.next;
		}
		
		temp  += current.item;
		return temp;
	}
}

public class linkedListS1S3Q31P166 {
	public static void main(String []args) {
		
		// Client Code of the Linkedlist with DoubleNode
		
		// insert_at_start function usage
		linkListS1S3Q31<String> list = new linkListS1S3Q31();
		
		list.insert_at_start("First");
		list.insert_at_start("Second");
		list.insert_at_start("Third");
		list.insert_at_start("Forth");
		list.insert_at_start("Fifth");
		
		StdOut.println(list.toString());
		
		// insert_at_end function usage
		linkListS1S3Q31<String> list2 = new linkListS1S3Q31();
		
		list2.insert_at_end("First");
		list2.insert_at_end("Second");
		list2.insert_at_end("Third");
		list2.insert_at_end("Forth");
		list2.insert_at_end("Fifth");
		
		StdOut.println(list2.toString());
		
		// remove_from_start function usage
		list.remove_from_start();
		list.remove_from_start();
		
		StdOut.println(list.toString());
		
		// insert_at_end function usage
		list2.remove_from_end();
		list2.remove_from_end();
		
		StdOut.println(list2.toString());
	}
}
