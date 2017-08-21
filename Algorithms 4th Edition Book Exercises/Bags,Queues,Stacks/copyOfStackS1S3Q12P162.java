public class copyOfStackS1S3Q12P162 {
	public static myStack<String> getCopyOfStack(myStack<String> stack) {
		myStack<String> temp = new myStack<String>();
		myStack<String> temp1 = new myStack<String>();
		
		for(String a : stack ) { temp.push(a); }
		
		for(String a : temp ) { temp1.push(a); }
		
		return temp1;
	}
	
	public static void main( String[] args) {
		myStack<String> stack = new myStack<String>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");
		stack.push("Forth");
		
		myStack<String> cStack = getCopyOfStack(stack);
		
		StdOut.println("Copied Stack");
		for(String a : cStack ) {
			StdOut.print(" *** " + a);
		}
		
		StdOut.println();
		StdOut.println("Original Stack");
		for(String a : stack ) {
			StdOut.print(" --- " + a );
		}
	}
}
