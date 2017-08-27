class linkListS1S3Q30<Item> extends linkListS1S3Q28<Item> {
	Node iterative_reverse_list(Node head) {
		
		// We use 3 pointer for reversing list
		Node p0 = null;
		Node p1 = head;
		Node current;
		
		while(p1 != null) {
			current = p1;
			p1 = current.next;
			current.next = p0;
			p0 = current;
		}
		
		first = p0;
		return p0;
	}
}

public class linkedListS1S3Q30P165 {
	public static void main(String []args) {
		linkListS1S3Q30<Integer> list = new linkListS1S3Q30();
		
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(7);
		list.insert(2);	
		
		StdOut.println(list.toString());
		
		list.iterative_reverse_list(list.first);
		
		StdOut.println(list.toString());
	}
}
