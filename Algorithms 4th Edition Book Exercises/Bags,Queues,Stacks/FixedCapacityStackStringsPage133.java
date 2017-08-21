class FixedCapacityStackStrings {
		private int N = 0;
		private String []stack;
		
		public FixedCapacityStackStrings(int cap) { stack = new String[cap]; };
		
		public void push(String s) { stack[N++] = s; };
		
		public int size() { return N; };
		
		public String pop() { return stack[--N]; };
		
		public boolean isEmpty() { return N == 0; };
		
		public boolean isFull() { return N == stack.length; };
}

public class FixedCapacityStackStringsPage133 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedCapacityStackStrings stack = new FixedCapacityStackStrings(100);
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if( !s.equals("-")) {
				if( ! ( stack.size() >= 100 ) ) {
					stack.push(s);
				}
			} else {
				if( !stack.isEmpty() ) StdOut.print(stack.pop());
			}
		}
	}

}
