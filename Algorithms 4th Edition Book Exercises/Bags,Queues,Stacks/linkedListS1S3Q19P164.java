class linkListS1S3Q19<Item> {
	Node first;
	
	protected class Node {
		Item item;
		Node next;
	}

	void insert(Item item) {
		Node temp = new Node();
		
		temp.item = item;
		temp.next = null;
		
		if(first != null) {
			Node end = findLastNode();
			end.next = temp;
		} else {
			first = temp;
		}
	}
	
	// Answer of question 1.3.19
	Item removeLastNode() {
		Node current = first;
		
		// Finding node before last node
		while(current.next.next != null) {
			current = current.next;
		}
		
		// Get last node data
		Item temp = current.next.item;
		
		// Removing last node using garbage collector
		current.next = null;
		
		return temp;
	}
	
	Node findLastNode() {
		Node current = first;
		
		// Find last node
		while(current.next != null) { current = current.next; }
		
		return current;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node current = first;
		String temp = "";
		
		while(current.next != null) {
			temp += current.item + " , ";
			current = current.next;
		}
		
		temp  += current.item;
		return temp;
	}
}

public class linkedListS1S3Q19P164 {
	
	
	public static void main(String args[]) {
		linkListS1S3Q19<String> list = new linkListS1S3Q19();
		
		list.insert("First");
		list.insert("Second");
		list.insert("Third");
		list.insert("Forth");
		list.insert("Fifth");
		
		StdOut.println(list.toString());
		
		list.removeLastNode();
		
		StdOut.println("After removing last node");
		StdOut.println(list.toString());
	}
}
