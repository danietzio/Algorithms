class linkListS1S3Q20<Item> {
	Node first;
	
	private class Node {
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
	
	// Question 1.3.20 answer
	Item remove_Kth_Node(int k) {
		int count = 1;
		Node current = first;
		
		while( count < k && (current.next.next != null) ) {
			current = current.next;
			count++;
		}
		
		if(count != k) {
			// Doesn't exists
			return (Item) null;
		} else {
			Item item = current.next.item;
			
			// Removing k-th element with garbage collector
			current.next = current.next.next;
			
			// Returning value of the removed node
			return item;
		}
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

public class linkedListS1S3Q20P164 {
	
	public static void main(String args[]) {
		linkListS1S3Q20<String> list = new linkListS1S3Q20();
		
		list.insert("First");
		list.insert("Second");
		list.insert("Third");
		list.insert("Forth");
		list.insert("Fifth");
		
		StdOut.println(list.toString());
		
		// Removing k-th element from the linked list
		list.remove_Kth_Node(2);
		
		StdOut.println("After removing K-th node");
		StdOut.println(list.toString());
	}
}
