class linkListS1S3Q20<Item> extends linkListS1S3Q19<Item> {
		
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
