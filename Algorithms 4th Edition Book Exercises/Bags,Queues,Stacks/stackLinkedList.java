public class stackLinkedList<Item> {
	private Node node = new Node();
	private Node first;
	private int N = 0;
	
	public stackLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	private class Node {
		Item data;
		Node next;
	}
	
	public void push(Item item) {
		if(first != null) {
			Node temp = new Node();
			temp.next = first;
			temp.data = item;
			first = temp;
		} else {
			Node temp = new Node();
			temp.next = null;
			temp.data = item;
			first = temp;
		}
		N++;
	}
	
	public Item pop() {
		N--;
		Item item = first.data;
		first = first.next;
		
		return item;
	}
}
