class linkListS1S3Q21<Item> extends linkListS1S3Q20<Item> {
	boolean find(Item item) {
		Node current = first;
		
		while(current != null) {
			if(current.item == item) return true;
			current = current.next;
		}
		return false;
	}
}
public class linkedListS1S3Q21P164<Item> {
	public static void main(String args[]) {
		linkListS1S3Q21<String> list = new linkListS1S3Q21();
		
		list.insert("Dani");
		list.insert("John");
		list.insert("Alex");
		list.insert("Simon");
		list.insert("Clara");
		
		StdOut.println(list.toString());
		
		// Removing k-th element from the linked list
		StdOut.println("James" + ( list.find("James") ? " " : " Not ") + "Founded in list");
		StdOut.println("Alex" + ( list.find("Alex") ? " " : " Not ") + "Founded in list");
	}
}
