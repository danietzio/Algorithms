class FixedCapacityStack<Item> {
	private Item []stack;
	private int N = 0;
	
	public FixedCapacityStack(int cap) { stack = (Item [])new Object[cap]; }
	
	public void push(Item value) { stack[N++] = value; }
	
	public Item pop() { return stack[--N]; }
	
	public int size() { return N; }
	
	public boolean isEmpty() { return N == 0; }
}
public class FixedCapacityStackPage135 {
	public static void main(String [] args) {
		// creating fixed stack with 100 items
		FixedCapacityStack<Integer> stack = new FixedCapacityStack(100);
		
		while(!StdIn.isEmpty()) {
			int i = StdIn.readInt();
			if( i != -1 ) {
				if( !( stack.size() >= 100 )) {
					stack.push(i);
				}
			} else {
				if ( !stack.isEmpty() ) {
					StdOut.println(stack.pop());
				}
			}
		}
	}
}
