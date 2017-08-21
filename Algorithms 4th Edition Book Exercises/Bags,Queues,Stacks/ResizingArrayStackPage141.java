import java.util.Iterator;

class ResizingArrayStack<Item> implements Iterable<Item>{
	Item [] stack;
	int N = 0;
	
	public ResizingArrayStack() {
		// TODO Auto-generated constructor stub
		stack = (Item []) new Object[1];
	}
	
	private void resize(int MAX) {
		Item[] tempStack = (Item []) new Object[ MAX ];
		for (int i = 0; i < N; i++) tempStack[i] = stack[i];
		this.stack = tempStack;
	}
	
	public void push(Item t) {
		if( N == stack.length ) resize( stack.length * 2);
		stack[N++] = t;
	}
	
	// returns the most recently inserted item on the stack (without popping it).
	public Item peek() {
		return stack[N - 1];
	}
	
	public Item pop() {
		Item temp = stack[--N];
		stack[N] = null;
		
		if ( N == stack.length / 4 ) resize( stack.length / 2);
		return temp;
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}

	public Iterator<Item> iterator() {
		return new resizingArrayIterator();
	}
	
	private class resizingArrayIterator implements Iterator<Item> {
		public int i = N;
		
		public boolean hasNext() { return i > 0; }
		public Item next() { return stack[--i]; }
		
		public void remove() { };
	}
}

public class ResizingArrayStackPage141 {

	public static void main(String[] args) {
		ResizingArrayStack<String> a = new ResizingArrayStack<String>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if( !s.equals("-")) {
				a.push(s);
			} else {
				if( !a.isEmpty() ) {
					StdOut.println(a.pop());
				}
			}
		}
		
		for(String temp: a) {
			StdOut.print("@@ " + temp + " @@ ");
		}
	}
}
