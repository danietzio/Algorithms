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
	
	Node recursive_reverse_list(Node node) {
		
		// If we get to the end of the linked list, we should return node
		if( node.next == null ) {
			first = node;
			return node;
		}
		
		// Holding track of the node.next
		Node temp = node.next;
		
		// We should make "node.next" null because if we don't do this
		// we'll have node that points to next node after last execution of the
		// recursive function while because that node is the last node in new
		// created linked list, it should point to null value
		node.next = null;
		
		// Recalling recursive function
		// after that next line recursive function call, executed
		// we'll have pointer to next node
		Node a = recursive_reverse_list(temp);
		
		// Making next node to point to this node
		a.next = node;
		return node;
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
		
		list.recursive_reverse_list(list.first);
		
		StdOut.println(list.toString());
	}
}
