class linkListS1S3Q26<Item> extends linkListS1S3Q25<Item> {
	void remove(Item key) {
		// Remove first node if it has key
		if( first.item == key ) { first = first.next; }
		
		Node current = first;
		
		// Removing Other nodes with this key
		while(current.next != null) {
			if(current.next.item == key ) { this.removeAfter(current); }
			
			// Check whether current node is last item or not in list or not ?!?
			if(current.next != null) current = current.next;
		}
	}
}
public class linkedListS1S3Q26P165 {
	public static void main(String args[]) {
		linkListS1S3Q26<String> list = new linkListS1S3Q26();
		
		list.insert("Dani");
		list.insert("John");
		list.insert("Dani");
		list.insert("Simon");
		list.insert("Dani");
		
		StdOut.println(list.toString());
		
		// Remove all nodes with "Dani" name
		list.remove("Simon");
		
		StdOut.println(list.toString());
	}
}
