class linkListS1S3Q24<Item> extends linkListS1S3Q21<Item> {
	Item removeAfter(Node node) {
		if( node.next != null ){
			Item temp = node.next.item;
			node.next = node.next.next;
			
			return temp;
		} else {
			return (Item) null;
		}
	}
	
	void removeAfterUsage() {
		Node current = first;
		
		// Removing all of the nodes following first node
		while( removeAfter(current) != null ) {}
	
	}
}

public class linkedListS1S3Q24P164 {
	public static void main(String args[]) {
		linkListS1S3Q24<String> list = new linkListS1S3Q24();
		
		list.insert("Dani");
		list.insert("John");
		list.insert("Alex");
		list.insert("Simon");
		list.insert("Clara");
		
		StdOut.println(list.toString());
		
		// Remove all nodes following first node using removeAfter function
		list.removeAfterUsage();
		
		StdOut.println(list.toString());
	}
}
