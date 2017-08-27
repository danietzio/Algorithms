class linkListS1S3Q28<Item> extends linkListS1S3Q27<Item> {
	
	int recursive_max(Node first, int max) {
		if(first == null) return max;
		return recursive_max(first.next, (int)(first.item) > max ? (int)(first.item) : max);
	}
}

public class linkedListS1S3Q28P165 {
	public static void main(String args[]) {
		linkListS1S3Q28<Integer> list = new linkListS1S3Q28();
		
		list.insert(1);
		list.insert(3);
		list.insert(2);
		list.insert(7);
		list.insert(2);
		
		StdOut.println(list.toString());

		StdOut.println(list.recursive_max(list.first, 0));
	}
}
