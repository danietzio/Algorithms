class linkListS1S3Q27<Item> extends linkListS1S3Q26<Item> {
	int max(Node first) {
		try {
			if(first != null) {
				int max = (int) first.item;
				
				Node current = first;
				while(current != null) {
					if((int)current.item > max ) {
						max = (int) current.item; 
					}
					current = current.next;
				}
				return max;
			} else {
				// list is empty
				return 0;
			}
		} catch ( ClassCastException e ){
			// Values should be integer
			StdOut.println("All keys should be Integer");
			return 0;
		}
	}
}

public class linkedListS1S3Q27P165 {
	public static void main(String args[]) {
		linkListS1S3Q27<Integer> list = new linkListS1S3Q27();
		
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(7);
		list.insert(2);
		
		StdOut.println(list.toString());

		StdOut.println(list.max(list.first));
	}
}
