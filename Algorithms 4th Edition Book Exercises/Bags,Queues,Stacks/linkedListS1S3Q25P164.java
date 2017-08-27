class linkListS1S3Q25<Item> extends linkListS1S3Q24<Item> {
	void insertAfter(Node first, Node second) {
		Node temp = first.next;
		first.next = second;
		second.next = temp;
	}
	
	// inserting new node after first node
	void insertAfterUsage(Item item) {
		Node current = first;
		Node temp;
		
		temp = new Node();
		temp.item = item;
		temp.next = null;
		
		insertAfter(current, temp);
	}
}

public class linkedListS1S3Q25P164 {
	public static void main(String args[]) {
		linkListS1S3Q25<String> list = new linkListS1S3Q25();
		
		list.insert("Dani");
		list.insert("John");
		list.insert("Alex");
		list.insert("Simon");
		list.insert("Clara");
		
		StdOut.println(list.toString());
		
		// Remove all nodes following first node using removeAfter function
		list.insertAfterUsage("Other Node");
		
		StdOut.println(list.toString());
	}
}
